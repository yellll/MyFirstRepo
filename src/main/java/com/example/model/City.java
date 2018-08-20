package com.example.model;

import java.io.Serializable;

public class City implements Serializable{
	int id;
	String name;
	String country;
	String state;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public City(int id, String name,String state,String country) {
		super();
		this.id = id;
		this.name = name;
		this.state=state;
		this.country=country;
	}
	public City() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
