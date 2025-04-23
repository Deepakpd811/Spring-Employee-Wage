package com.bridgelab.employeeWage.controller;

import com.bridgelab.employeeWage.dto.EmployeePayrollDTO;
import com.bridgelab.employeeWage.model.EmployeePayrollData;
import com.bridgelab.employeeWage.dto.ResponseDTO;
import com.bridgelab.employeeWage.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeePayrollController {

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List<EmployeePayrollData> empList = null;
        empList = employeePayrollService.getEmployeePayrollData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", empList);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData empData = null;
        empData = employeePayrollService.getEmployeePayrollDataById(empId);
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful", empData);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = employeePayrollService.createEmployeePayrollData(empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successfully", empData);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable int id, @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = employeePayrollService.updateEmployeePayrollDataById(id,empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully", empData);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        employeePayrollService.deleteEmployeePayrollData(empId);
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted id: " + empId);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }
}
