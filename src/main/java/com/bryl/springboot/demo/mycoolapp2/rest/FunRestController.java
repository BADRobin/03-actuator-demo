package com.bryl.springboot.demo.mycoolapp2.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHallo() {
		return "HelloWorld! Time on server is: " + LocalDateTime.now();
	}
	//expose a new endpoint fow "workout"

	@GetMapping("/workout")
		public String getDailyWorkout(){
		return "Run a hard 5k!!!";
	}
	//expose a new endpoint fow "fortune"

	@GetMapping("/fortune")
	public String  getDailyFortune(){
		return "Today you will bee dead. ";

	}



}
