package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.buisiness.service.ClassroomService;

@Path("/class")
public class ClassroomsEndpoint {

	@Inject
	private ClassroomService service;

	@Path("/getAllClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}


	
	
	

	public void setService(ClassroomService service) {
		this.service = service;
	}

}
