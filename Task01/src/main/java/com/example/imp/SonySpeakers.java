package com.example.imp;

import org.springframework.stereotype.Component;

import com.example.interfaces.SpeakersMain;

@Component
public class SonySpeakers implements SpeakersMain {

	public void makeSound() {
		
		System.out.println("SonySpeakers are playing in Vehicle");
		
	}

}
