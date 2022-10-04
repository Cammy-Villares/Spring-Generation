package com.helloworld.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos-apredendizagem")
public class ObjetivosApredinzagemController {
	@GetMapping
	public String ObjetivoAprendizagem() {
		return "Revisar alguns conceitos da linguagem Java, finalizar todas as atividades e persistir apesar das dificuldades.";

} 
}
