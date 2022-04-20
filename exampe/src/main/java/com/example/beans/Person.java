package com.example.beans;

public class Person {

	private String personName;
	private Vehicle vehicle;
	
	public Person() {
		System.out.println("Person Bean Created");
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
