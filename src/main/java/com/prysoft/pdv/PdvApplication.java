package com.prysoft.pdv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PdvApplication {
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(PdvApplication.class);
		builder.headless(false);

		ConfigurableApplicationContext context = builder.run(args);
	}
}
