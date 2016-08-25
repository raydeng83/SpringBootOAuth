package com.ldeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class UiImplicitApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UiImplicitApplication.class, args);
	}
}
