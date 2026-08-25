package com.javanauta.revisaobffagendadortarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RevisaoBffAgendadorTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevisaoBffAgendadorTarefasApplication.class, args);
	}

}
