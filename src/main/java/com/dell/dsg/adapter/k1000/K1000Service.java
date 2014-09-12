package com.dell.dsg.adapter.k1000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dell.dsg.adapter.k1000.domain.Login;
import com.dell.dsg.domain.ComputerSystem;
import com.dell.dsg.domain.ComputerSystemBase;

@Service
//TODO think about interfaces for adapter
public class K1000Service {
	static final Logger logger = Logger.getLogger(K1000Service.class);

	@Value("${host}")
	private String host;
	@Value("${user}")
	private String user;
	@Value("${password}")
	private String password;
	@Value("${prod-id}")
	private String prodId;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<ComputerSystemBase> getComputerSystems() {
		Response response = getTarget().path("machines").request()
				.accept(MediaType.APPLICATION_JSON_TYPE).get();
		// TODO pojo for k1000?
		Collection<Map> machines = response.readEntity(Collection.class);
		List<ComputerSystemBase> computers = new ArrayList<ComputerSystemBase>(); 
		for (Map machine : machines) {
			ComputerSystemBase comp = new ComputerSystemBase(prodId);
			comp.mapK1000(machine);
			computers.add(comp);
		}
		response.close();
		return computers;
	}

	public ComputerSystem getComputerById(String id) {
		Response response = getTarget().path("machine/" + id).request()
				.accept(MediaType.APPLICATION_JSON_TYPE).get();
		Map machine = response.readEntity(Map.class);
		ComputerSystem computer = new ComputerSystem(prodId);
		computer.mapK1000(machine);
		response.close();
		return computer;
	}
	
	private ResteasyWebTarget getTarget() {
		// TODO don't create in every call
		ResteasyClient client = new ResteasyClientBuilder().build();
		Login login = new Login(user, password);
		ResteasyWebTarget target = client.target(host);
		Response response = target.path("login").request()
				.header(HttpHeaders.USER_AGENT, "DSGP")
				.post(Entity.entity(login, MediaType.APPLICATION_JSON_TYPE));
		if (Response.Status.OK.getStatusCode() != response.getStatus()) {
			logger.error("Unable to login to " + host);
		}
		response.close();
		return target;
	}


}
