package spring.rest.passmanager.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan ({
	"spring.rest.passmanager.dataaccess",
	"spring.rest.passmanager.business",
	"spring.rest.passmanager.rest.controller"
})
@EnableJpaRepositories({"spring.rest.passmanager.dataaccess"})
public class PassManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassManagerApplication.class, args);
	}

}
