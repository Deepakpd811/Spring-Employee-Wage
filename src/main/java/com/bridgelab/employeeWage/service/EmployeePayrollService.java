package com.bridgelab.employeeWage.service;

import com.bridgelab.employeeWage.dto.EmployeePayrollDTO;
import com.bridgelab.employeeWage.model.EmployeePayrollData;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService implements IEmployeePayrollService{

    List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();

    // Get all employee
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollDataList;
    }

    // Get employee by id
    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int id) {
        return employeePayrollDataList.get(id-1);
    }

    // Create employee
    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO dto) {
        EmployeePayrollData emp = null;
        emp = new EmployeePayrollData(employeePayrollDataList.size()+1, dto);
        employeePayrollDataList.add(emp);
        return emp;
    }

    // Update the employee
    @Override
    public EmployeePayrollData updateEmployeePayrollDataById(int id, EmployeePayrollDTO dto) {
        EmployeePayrollData emp= this.getEmployeePayrollDataById(id);
        emp.setName(dto.getName());
        emp.setGender(dto.getGender());
        emp.setSalary(dto.getSalary());

        return emp;
    }

    // Delete the employee
    @Override
    public void deleteEmployeePayrollData(int id) {
        employeePayrollDataList.remove(id-1);
    }
}
