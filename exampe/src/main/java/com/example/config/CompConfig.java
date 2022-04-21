package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.beans"})
public class CompConfig {

	@Bean
	String str() {
		return "Bean Annotaion";
	}

}
