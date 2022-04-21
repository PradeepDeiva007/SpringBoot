package com.example.imp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.interfaces.SpeakersMain;

@Component
@Primary
public class BoseSpeakers implements SpeakersMain {

	public void makeSound() {

		System.out.println("BoseSpeakers are playing in Vehicle");

	}

}
