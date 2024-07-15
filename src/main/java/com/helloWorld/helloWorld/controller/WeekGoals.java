package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/week/goals")
public class WeekGoals {
	@GetMapping
	public String weekGoals() {
		return "Objetivos da Semana:"
				+ "\n- Aprender Spring Security"
				+ "\n- Colocar as atividades em dia"
				+ "\n- Aprender REST API"; 
	}
}
