package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("ma.projet.entities")
@EnableJpaRepositories (basePackages = "ma.projet.repositories")
@ComponentScan(basePackages = {"ma.projet.services","ma.projet.controller"})

public class School1Application {

	public static void main(String[] args) {
		SpringApplication.run(School1Application.class, args);
	}

}
