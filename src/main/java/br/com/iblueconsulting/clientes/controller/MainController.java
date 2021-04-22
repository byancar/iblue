package br.com.iblueconsulting.clientes.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class MainController {

	    @GET
	    public Response getWelcome() {
	    	String result = "Welcome to Clientes API.";
			return Response.status(200).entity(result).build();
	    }   

}
