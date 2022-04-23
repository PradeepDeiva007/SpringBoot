package com.example.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.model.Contact;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ContactService {

	public Contact getResponse(Contact contact) {
		
		log.info("Details: "+contact.toString());
		
		return contact;
	}

	public String getReplay(String value) {
		
		return value;
	}

}
