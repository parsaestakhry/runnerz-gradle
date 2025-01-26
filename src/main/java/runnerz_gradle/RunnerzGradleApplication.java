package runnerz_gradle;

import java.time.LocalDateTime;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import runnerz_gradle.run.Location;
import runnerz_gradle.run.Run;

@SpringBootApplication
public class RunnerzGradleApplication {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(RunnerzGradleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerzGradleApplication.class, args);

	}

	@Bean
	CommandLineRunner runner() {
		return _ -> {

			Run run = new Run(1, "Morning Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5,
					Location.Outdoor);

			log.info("Run: " + run);
		};
	}

}
