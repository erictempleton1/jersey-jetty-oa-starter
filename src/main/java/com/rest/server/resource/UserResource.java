package com.rest.server.resource;

import com.rest.server.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/user")
@Produces({"application/json"})
public class UserResource {

    @GET
    @Path("/{userId}")
    public User getUserById(@PathParam("userId") Long userId) {
        User user = new User();
        user.setFirstName("eric");
        user.setLastName("templeton");
        return user;
    }
}
