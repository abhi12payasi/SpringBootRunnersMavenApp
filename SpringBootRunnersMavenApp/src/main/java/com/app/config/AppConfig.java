package com.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner clr() {
		return new CommandLineRunner() {
			public void run(String...args) throws Exception{
				System.out.println("from inner class runner");
			}
		};
	}
	@Bean
	public CommandLineRunner cl() {
		return args->System.out.println("From lambda expression runner");
	}
}
