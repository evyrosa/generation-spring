package com.generation.ExerciciosSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ExerciciosSpringController {
	
	@GetMapping
	public String hello() {
		return "Hello Generation!";
	}
	
	@GetMapping
	@RequestMapping("/mentalidades")
	public String mentalidades () {
		return "Atenção aos detalhes, mentalidade de crescimento e mentalidade de persistência";
	}
	
	@GetMapping
	@RequestMapping("/objetivos")
	public String objetivos () {
		return "Objetivos da semana: Aprender Spring e andar de patins";
	}

}
