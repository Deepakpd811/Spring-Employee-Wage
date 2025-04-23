package com.bridgelab.employeeWage.dto;

import java.math.BigDecimal;

public class EmployeePayrollDTO {

    private int id;
    private String name;

    private String gender;

    private int salary;

    public EmployeePayrollDTO(String name, String gender, int salary){
        this.name=name;
        this.gender =gender;
        this.salary = salary;
    }

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