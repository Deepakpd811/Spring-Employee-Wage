package com.bridgelab.employeeWage.service;

import com.bridgelab.employeeWage.dto.EmployeePayrollDTO;
import com.bridgelab.employeeWage.model.EmployeePayrollData;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService implements IEmployeePayrollService{
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> emplist = new ArrayList<>();
        emplist.add(new EmployeePayrollData(1,
                new EmployeePayrollDTO("deepak","male",32343)));
        return emplist;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int id) {
        EmployeePayrollData emp = new EmployeePayrollData(1,
                new EmployeePayrollDTO("deepak","male",32343));
        return null;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO dto) {
        return null;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollDataById(EmployeePayrollDTO dto) {
        return null;
    }

    @Override
    public void deleteEmployeePayrollData(int id) {

    }
}
