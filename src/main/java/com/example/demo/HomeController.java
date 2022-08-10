package com.example.demo;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	   @GetMapping("/")
	   String home(Principal user) {
	       return "Hello Logged in User is " + user.getName();
	   }

}
