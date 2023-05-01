package com.rajeshkawali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author Rajesh_Kawali
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringbootLombokCustomValidationExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLombokCustomValidationExceptionApplication.class, args);
	}

}
