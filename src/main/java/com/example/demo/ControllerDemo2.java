package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerDemo2 {
	@GetMapping("/hello")
		public String hello() {
		return "Welcome to String Boot";
	}
}