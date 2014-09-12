package com.dell.dsg.adapter.k1000;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dell.dsg.adapter.CompuerSystemAdapter;
import com.dell.dsg.domain.ComputerSystem;

@Controller
@Path(K1000Adapter.API_URL)
public class K1000Adapter implements CompuerSystemAdapter {
	public static final String API_URL = "/api";

	@Autowired
	K1000Service adapter;

	public Response getComputerSystems() {
		return Response.status(200).entity(adapter.getComputerSystems())
				.build();
	}

	public ComputerSystem getComputerSystems(String id) {
		return adapter.getComputerById(id);
	}

}
