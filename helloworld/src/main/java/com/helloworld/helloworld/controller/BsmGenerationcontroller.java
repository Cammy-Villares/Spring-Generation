package com.helloworld.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm-generation")
public class BsmGenerationcontroller {
	@GetMapping
	public String Bsmgeneration() {
		return "Comunicação, proatividade, persistência e responsabilidade pessoal";

}
}