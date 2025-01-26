package com.example.runnerz_gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import foo.WelcomeMessage;

@SpringBootApplication
public class RunnerzGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerzGradleApplication.class, args);
		var welcomeMessage = new WelcomeMessage();
		System.out.println(welcomeMessage.getWelcomeMessage());
	}

}
