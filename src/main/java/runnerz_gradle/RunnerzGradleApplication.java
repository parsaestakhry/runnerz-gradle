package runnerz_gradle;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerzGradleApplication {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(RunnerzGradleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RunnerzGradleApplication.class, args);
		log.info("Application is running successfully");
		
		
	}

}
