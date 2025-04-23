package com.bridgelab.employeeWage.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeePayrollDTO {

    private int id;
    private String name;

    private String gender;

    private int salary;

    public EmployeePayrollDTO(String name, String gender, int salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
}