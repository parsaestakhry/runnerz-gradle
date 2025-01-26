package com.example.runnerz_gradle;


import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to Runnerz Gradle!";
    }
}
