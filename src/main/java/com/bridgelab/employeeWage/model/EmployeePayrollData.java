package com.bridgelab.employeeWage.model;

import com.bridgelab.employeeWage.dto.EmployeePayrollDTO;

import java.math.BigDecimal;


 // Assuming your table is named 'employee'
public class EmployeePayrollData {


    private Integer id;
    private String name;
    private String gender;
    private int salary;

    public EmployeePayrollData(int id , EmployeePayrollDTO dto){
        this.id = id;
        this.name = dto.getName();
        this.gender = dto.getGender();
        this.salary = dto.getSalary();
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
