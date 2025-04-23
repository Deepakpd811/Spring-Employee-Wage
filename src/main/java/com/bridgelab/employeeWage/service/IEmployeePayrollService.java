package com.bridgelab.employeeWage.service;


import com.bridgelab.employeeWage.dto.EmployeePayrollDTO;
import com.bridgelab.employeeWage.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int id);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO dto);
    EmployeePayrollData updateEmployeePayrollDataById(EmployeePayrollDTO dto);
    void deleteEmployeePayrollData(int id);


}
