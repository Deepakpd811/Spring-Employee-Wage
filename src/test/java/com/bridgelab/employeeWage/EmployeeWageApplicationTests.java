package com.bridgelab.employeeWage;

import com.bridgelab.employeeWage.dto.EmployeePayrollDTO;
import com.bridgelab.employeeWage.model.EmployeePayrollData;
import com.bridgelab.employeeWage.service.EmployeePayrollService;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
class EmployeeWageApplicationTests {

	@Autowired
	private EmployeePayrollService employeePayrollService;
	private List<EmployeePayrollData> list = new ArrayList<>();
	private EmployeePayrollDTO emp ,emp2,emp3;
	@BeforeEach
	void setup(){

		emp = new EmployeePayrollDTO("deepak","male",123456);
		emp2 = new EmployeePayrollDTO("Ritick","male",1400006);
		emp3 = new EmployeePayrollDTO("raj","male",100056);
		employeePayrollService.createEmployeePayrollData(emp);
		employeePayrollService.createEmployeePayrollData(emp2);
		employeePayrollService.createEmployeePayrollData(emp3);
	}

	@Test
	void contextLoads() {
		list = employeePayrollService.getEmployeePayrollData();
		// Assert that the list is not empty
		assertFalse(list.isEmpty());

		// Assert that the list contains the correct employee data
		assertTrue(list.contains(emp));
		assertTrue(list.contains(emp2));
		assertTrue(list.contains(emp3));
	}

}
