package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    SmartGreeter greeter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name) {
        return greeter.greet();
    }

    @Path("time")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String time() {
        return greeter.time();
    }

    @Path("pet")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Pet pet() {
        return greeter.pet();
    }
}
