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

//	@Path("/addAccount")
//	@POST
//	@Produces({ "application/json" })
//	public String addAccount(String account) {
//		return service.addAccount(account);
//	}
//	
//	@Path("/updateAccount/{id}")
//	@PUT
//	@Produces({ "application/json" })
//	public String updateAccount(@PathParam("id") Long id, String account) {
//		return service.updateAccount(id, account);
//	}
//	
//	
//	
//	
//	
//
//	@Path("/deleteAccount/{id}")
//	@DELETE
//	@Produces({ "application/json" })
//	public String deleteAccount(@PathParam("id") Long id) {
//		return service.deleteAccount(id);
//	}
//	
//	@Path("/getAccount/{id}")
//	@GET
//	@Produces({ "application/json" })
//	public String getAccount(@PathParam("id") Long id) {
//		return service.getAccount(id);
//	}
	
	
	

	public void setService(ClassroomService service) {
		this.service = service;
	}

}
