package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.SpeakersMain;
import com.example.interfaces.TyresMain;

@Component
public class VehicleService {

	@Autowired
	private SpeakersMain speakers;

	private TyresMain tyres;

	public SpeakersMain getSpeakers() {
		return speakers;
	}

	public void setSpeakers(SpeakersMain speakers) {
		this.speakers = speakers;
	}

	public TyresMain getTyres() {
		return tyres;
	}

	@Autowired
	@Qualifier("bTyre")
	public void setTyres(TyresMain tyres) {
		this.tyres = tyres;
	}

	public void playMusic() {
		speakers.makeSound();
	}

	public void moveVehicle() {
		tyres.rotate();
	}

}
