package com.restexample;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User{
	private String name;
	private int number;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", number=" + number + ", id=" + id + "]";
	}


	

}