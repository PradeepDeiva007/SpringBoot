package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.imp", "com.example.service" })
@ComponentScan(basePackageClasses = { com.example.beans.Person.class, com.example.beans.Vehicle.class })
public class VehicleConfig2 {

}
