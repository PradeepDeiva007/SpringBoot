package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = {"com.example.beans"})
public class AutoWiredConfig {
	
	@Bean
	Vehicle v1() {
		Vehicle v = new Vehicle();
		v.setName("SOKDA");
		return v;
	}
	
	@Bean
	Vehicle v2() {
		Vehicle v = new Vehicle();
		v.setName("Maruti Suzuki");
		return v;
	}
	
	@Bean
	@Primary
	Vehicle v3() {
		Vehicle v = new Vehicle();
		v.setName("Audi");
		return v;
	}

}
