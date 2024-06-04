package org.javaacademy.computer;

import org.javaacademy.computer.detail.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Runner.class, args);
		Computer computer = context.getBean(Computer.class);
		Computer computer2 = context.getBean(Computer.class);
		Computer computer3 = context.getBean(Computer.class);
		Computer computer4 = context.getBean(Computer.class);
		System.out.println(computer);
	}

}
