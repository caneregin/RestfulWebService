package com.restexample;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class UserRepository {
	List<User> users;
	
	Connection conn = null;
	
	public UserRepository(){
		String url = "jdbc:mysql://localhost:3308/rest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "12345";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	public List<User> getUsers()
	{
		List<User> users = new ArrayList<>();
		String sql = "select * from user";
		try {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			User u = new User();
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setNumber(rs.getInt(3));
		}
		}
		catch(Exception e) {System.out.println(e);}
		return users;
	}
	public User getUser(int id) {
		String sql = "select * from user where id="+id;
		User u = new User();
		try {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		if(rs.next())
		{
			u.setId(rs.getInt(1));
			u.setName(rs.getString(2));
			u.setNumber(rs.getInt(3));
		}
		}
		catch(Exception e) {System.out.println(e);}
		return u;
	}
	public void create(User u1) {
		// TODO Auto-generated method stub
		String sql = "insert into user values(?,?,?)";
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, u1.getId());
			st.setString(2, u1.getName());
			st.setInt(3, u1.getNumber());
			st.executeUpdate();
			
			}
			catch(Exception e) {System.out.println(e);}
	}

}
