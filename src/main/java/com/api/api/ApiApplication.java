package com.api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiApplication {

	@Autowired
	@Qualifier("nome")
	private String nomeAplicacao;

	@Autowired
	@Qualifier("versao")
	private String versaoAplicacao;

	@GetMapping(value = "/")
	public String getNome() {
		return nomeAplicacao + " " + versaoAplicacao;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
