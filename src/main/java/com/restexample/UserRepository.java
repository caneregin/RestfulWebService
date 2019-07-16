package com.restexample;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	List<User> users;
	public UserRepository() {
	users = new ArrayList<>();
	User u3 = new User();
	u3.setId(35);
	u3.setName("caner");
	u3.setNumber(85);
	User u2 = new User();
	u2.setId(20);
	u2.setName("hasan");
	u2.setNumber(50);
	users.add(u3);
	users.add(u2);
	}
	public List<User> getUsers()
	{
		return users;
	}
	public User getUser(int id) {
		for(User u : users) {
			if(u.getId()==id)
			return u;
		}
		return new User();
	}
	public void create(User u1) {
		// TODO Auto-generated method stub
		System.out.println("create desin");
		users.add(u1);
	}

}
