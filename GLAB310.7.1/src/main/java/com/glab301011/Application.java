package com.glab301011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.glab301011")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
