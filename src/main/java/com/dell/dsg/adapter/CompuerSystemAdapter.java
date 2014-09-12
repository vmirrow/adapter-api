package com.dell.dsg.adapter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;

import com.dell.dsg.domain.ComputerSystem;

public interface CompuerSystemAdapter {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("computers")
	@Wrapped
	public Response getComputerSystems();

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("computer/{id}")
	public ComputerSystem getComputerSystems(@PathParam("id") String id);

}
