package com.happytuk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication
@EnableJpaRepositories
public class Application {

	public static void main(String[] args) {
		log.info("server started");
		System.out.println("server started");
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);

	}

}
