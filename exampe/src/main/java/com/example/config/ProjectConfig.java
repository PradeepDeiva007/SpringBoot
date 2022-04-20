package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans.Vehicle;

@Configuration
public class ProjectConfig {
	
	@Primary
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
	
	@Bean
	Integer num() {
		return 20;
	}
}
