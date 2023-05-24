package com.diploma.pmsoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com.diploma.pmsoftware.*")
@SpringBootApplication
public class PMSoftwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PMSoftwareApplication.class, args);
	}

}
