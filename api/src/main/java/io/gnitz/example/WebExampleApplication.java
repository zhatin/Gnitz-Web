package io.gnitz.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WebExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebExampleApplication.class, args);
	}

}
