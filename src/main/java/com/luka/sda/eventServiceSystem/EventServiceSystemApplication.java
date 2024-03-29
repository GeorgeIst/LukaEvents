package com.luka.sda.eventServiceSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.luka.sda.eventServiceSystem.repository")
public class EventServiceSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventServiceSystemApplication.class, args);
	}

}
