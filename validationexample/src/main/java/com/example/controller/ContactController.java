package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Contact;
import com.example.service.ContactService;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("contact/")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping(path = "plan", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> handleSearchShipment() {

		String value = "pradeep";
		return new ResponseEntity<String>(contactService.getReplay(value),
				HttpStatus.OK);
	}

}
