package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	
   public String[] getCity() {
		
		return new String[]{"Chennai","Pune","Mumbai"};
	}

}
