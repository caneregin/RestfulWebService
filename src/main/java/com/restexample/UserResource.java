package com.restexample;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users")
public class UserResource {
	UserRepository repo = new UserRepository();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers() {
		System.out.print("usere girdin");
		return repo.getUsers();

	}
	@GET
	@Path("user/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser(@PathParam("id") int id)
	{
		System.out.print("usere girdinafasf9");
		return repo.getUser(id);
	} 
	
	@POST
	@Path("user")
	public User createUser(User u1)
	{
		System.out.print(u1);
		repo.create(u1);
		return u1;
	}
}
