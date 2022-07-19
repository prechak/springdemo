package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Joker;
import com.example.demo.model.JokerRepo;

@RestController
public class HelloController {
	@Autowired
	JokerRepo repo;
	
	@GetMapping("/hello")
	public String sayHello() {
		List<Joker> jokerList = repo.findAll();
		for(Joker j : jokerList) {
			System.out.println(j.getName());
		}
		return "Hello Test Test 123";
	}

}
