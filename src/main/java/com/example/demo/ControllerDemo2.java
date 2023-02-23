package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerDemo2 {
		@Value("${color}")
		private String color; 
		
		@GetMapping("/hello")
		public String hell() {
		return "Your favourite color is "+color;
	}
}