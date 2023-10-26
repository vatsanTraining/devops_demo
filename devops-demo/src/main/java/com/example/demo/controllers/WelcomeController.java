package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.WelcomeService;

@RestController
@RequestMapping
public class WelcomeController {

	@Autowired
	private WelcomeService service;
	
	public String[] getCity() {
		
		return this.service.getCity();
	}
}
