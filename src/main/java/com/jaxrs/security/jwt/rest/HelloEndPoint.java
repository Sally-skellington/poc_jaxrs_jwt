package com.jaxrs.security.jwt.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jaxrs.security.jwt.filters.JWTTokenNeeded;

import javax.ws.rs.QueryParam;

/**
 * Welcoming Controller
 * @author user
 *
 */
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloEndPoint {
	
	@GET
    @JWTTokenNeeded
	public Response sayHello(@QueryParam("message") String message) {
		return Response.ok().entity(message == null ? "no message" : message).build();
	}

}
