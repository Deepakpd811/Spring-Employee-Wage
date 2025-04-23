package com.bridgelab.employeeWage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class EmployeeWageApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EmployeeWageApplication.class, args);
		ApplicationContext Context = SpringApplication.run(EmployeeWageApplication.class, args);
		log.info("AddressBook app is started in {} Environment", Context.getEnvironment().getProperty("environment"));
	}

}
