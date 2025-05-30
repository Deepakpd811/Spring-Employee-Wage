package com.bridgelab.employeeWage;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class EmployeeWageApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EmployeeWageApplication.class, args);

		Dotenv dotenv = Dotenv.configure()
				.directory("./")  // Root directory where .env is located
				.load();

		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));



		ApplicationContext Context = SpringApplication.run(EmployeeWageApplication.class, args);
		log.info("AddressBook app is started in {} Environment", Context.getEnvironment().getProperty("environment"));
	}

}
