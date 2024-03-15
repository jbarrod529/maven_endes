package com.endes.app;

/*
 * @param name Employee's name
 * @param antiquity Employee's antiquity
 * @version 1.0
 * @author Joaquin Barrero
 * */
public class Employee {
	
	
	private String name;
	private int antiquity;
	
	public Employee(String name, int antiquity) {
		
		this.name = name;
		this.antiquity = antiquity;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", antiquity=" + antiquity + "]";
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAntiquity() {
		return antiquity;
	}


	public void setAntiquity(int antiquity) {
		this.antiquity = antiquity;
	}


	
	
	
	
}
