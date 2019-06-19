package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(10) //less order prior run
public class AppBRunner implements CommandLineRunner {
	public void run(String... args) throws Exception {
		System.out.println("from runner-B");
	}
}