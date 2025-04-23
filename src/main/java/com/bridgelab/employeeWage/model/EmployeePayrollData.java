package com.bridgelab.employeeWage.model;

import com.bridgelab.employeeWage.dto.EmployeePayrollDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class EmployeePayrollData {

    @Id
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


}
