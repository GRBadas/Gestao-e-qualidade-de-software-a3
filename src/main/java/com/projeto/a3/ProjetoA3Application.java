package com.projeto.a3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoA3Application {
	
	@GetMapping("/teste")
	public String teste() {
		return "Funcionando";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoA3Application.class, args);
	}

}
