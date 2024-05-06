package spring.rest.passmanager.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan ({
		"spring.rest.passmanager.repository",
		"spring.rest.passmanager.service",
	"spring.rest.passmanager.rest.controller"
})
@EnableJpaRepositories({"spring.rest.passmanager.repository"})
public class PassManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassManagerApplication.class, args);
	}

}
