package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class BSMController {
	@GetMapping
	public String bsms() {
		return "BSMS: "
				+ "\n- Comunicação"
				+ "\n-Trabalho em Equipez"
				+ "\n- Orientação para o Crescimento"
				+ "\n- Resiliência"
				+ "\n- Adaptabilidade";
	}
}
