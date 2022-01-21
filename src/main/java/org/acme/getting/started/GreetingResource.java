package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello") //this returns hello on hello endpoint
public class GreetingResource {

    @Inject  //call it here to be used
    GreetingService service;

    @GET //specify type of request
    @Produces(MediaType.TEXT_PLAIN) //specify media type used
    @Path("/greeting/{name}") //select the path of the greeting service
    public String greeting(@PathParam String name) {
        return service.greeting(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "Hello RESTEasy";
    }

}