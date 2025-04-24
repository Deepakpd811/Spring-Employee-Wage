package com.bridgelab.employeeWage.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeePayrollDTO {

    @NotEmpty(message = "Employee name cannot be empty")
    private String name;

    @NotEmpty(message = "Employee gender cannot be empty")
    private String gender;

    @Min(value = 500, message = "Min wage should be more than 500")
    private int salary;

    public EmployeePayrollDTO(String name, String gender, int salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
}