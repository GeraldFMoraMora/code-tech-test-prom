package com.test.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.test.tech.model.entity")
@EnableJpaRepositories(basePackages = "com.test.tech.model.dao")
public class TestTechClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTechClientsApplication.class, args);
		System.out.println("App is running...");
	}

}
