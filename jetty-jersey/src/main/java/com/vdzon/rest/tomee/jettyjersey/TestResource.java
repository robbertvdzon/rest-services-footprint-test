package com.vdzon.rest.tomee.jettyjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("customers")
public class TestResource {
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer find(@PathParam("id") long id) {
        return new Customer("Robbert", id);
    }


}
