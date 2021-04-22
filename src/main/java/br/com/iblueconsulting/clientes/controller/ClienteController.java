package br.com.iblueconsulting.clientes.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.iblueconsulting.clientes.model.Cliente;
import br.com.iblueconsulting.clientes.service.IClienteService;

@Path("clientes")
public class ClienteController {
	 @Inject
	    private IClienteService clienteService;

	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response getClientes() {

	        List<Cliente> clientes = clienteService.findAll();

	        if (!clientes.isEmpty()) {
	            return Response.ok(clientes).build();
	        } else {
	            return Response.status(Response.Status.NOT_FOUND).build();
	        }
	    }

	    @Path("/{id}")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response findCity(@PathParam("id") Long id) {

	    	Cliente c = clienteService.find(id);

	        if (c.getId() != null) {
	            return Response.ok(c).build();
	        } else {
	            return Response.status(Response.Status.NOT_FOUND).build();
	        }
	    }

	    @POST
	    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	    public Response saveCity(@FormParam("nome") String nome,
	            @FormParam("cpf") String cpf) {

	    	Cliente c = new Cliente();
	        c.setNome(nome);
	        c.setCpf(cpf);

	        boolean r = clienteService.save(c);

	        if (r) {
	            return Response.ok().status(Response.Status.CREATED).build();
	        } else {
	            return Response.notModified().build();
	        }        
	    }

	    @Path("/{id}")
	    @PUT
	    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	    public Response updateCity(@FormParam("nome") String nome,
	            @FormParam("cpf") String cpf,
	            @PathParam("id") Long id) {

	        Cliente c = new Cliente();
	        c.setNome(nome);
	        c.setCpf(cpf);

	        boolean r = clienteService.update(c, id);
	        
	        if (r) {
	            return Response.ok().status(Response.Status.NO_CONTENT).build();
	        } else {
	            return Response.notModified().build();
	        }           
	    }

	    @Path("/{id}")
	    @DELETE
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response deleteCity(@PathParam("id") Long id) {

	        boolean r = clienteService.delete(id);

	        if (r) {
	            return Response.ok().status(Response.Status.NO_CONTENT).build();
	        } else {
	            return Response.notModified().build();
	        }
	    }

}
