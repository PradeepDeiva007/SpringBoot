package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans.Person;
import com.example.beans.Vehicle;

@Configuration
public class ProjectConfig {

	
	@Bean(name = "TVS")
	Vehicle vh1() {
		Vehicle vh1 = new Vehicle();
		vh1.setName("TVS");
		return vh1;
	}

	@Bean(value = "Honda")
	Vehicle vh2() {
		Vehicle v2 = new Vehicle();
		v2.setName("Honda");
		return v2;
	}

	@Bean("YAMAHA")
	Vehicle vh3() {
		Vehicle v3 = new Vehicle();
		v3.setName("YAMAHA");
		return v3;
	}

	@Bean
	String hello() {
		return "Welcome to Spring";
	}
	
	/* Wiring using method call */
	@Primary
	@Bean
	Vehicle vehicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Toyato");
		return vehicle;
		
	}
	
	@Bean
	Person person(Vehicle vehicle) {
		Person p = new Person();
		p.setPersonName("Rajesh");
		p.setVehicle(vehicle);
		return p;
	}

}
