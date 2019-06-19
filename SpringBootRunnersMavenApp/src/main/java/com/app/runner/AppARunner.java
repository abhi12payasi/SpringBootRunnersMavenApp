package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class AppARunner implements CommandLineRunner,Ordered {
	public void run(String... args)  throws Exception {
		System.out.println("from runner-A");
	} 
	public int getOrder() {
		return 5;
	}
}
