package com.bridgelab.employeeWage.controller;

import com.bridgelab.employeeWage.dto.EmployeePayload;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmpployeeController {

    private final List<EmployeePayload> employeeList = new ArrayList<>();
    private final Map<Integer, EmployeePayload> employeeMap = new HashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    @GetMapping
    public ResponseEntity<List<EmployeePayload>> getEmployee() {
        if (!employeeList.isEmpty()) {
            return ResponseEntity.ok(employeeList);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeePayload> getEmployee(@PathVariable Integer id) {
        EmployeePayload emp = employeeMap.get(id);
        if (emp != null) {
            return ResponseEntity.ok(emp);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/create")
    public ResponseEntity<EmployeePayload> postEmployee(@RequestBody EmployeePayload request) {
        int newId = idCounter.getAndIncrement();
        request.setId(newId); // Assuming EmployeePayload has an `id` field
        employeeList.add(request);
        employeeMap.put(newId, request);
        return ResponseEntity.ok(request);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeePayload> updateEmployee(
            @PathVariable Integer id,
            @RequestBody EmployeePayload request) {

        EmployeePayload existing = employeeMap.get(id);
        if (existing != null) {
            existing.setName(request.getName());
            existing.setSalary(request.getSalary());
            return ResponseEntity.ok(existing);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
        EmployeePayload removed = employeeMap.remove(id);
        if (removed != null) {
            employeeList.removeIf(emp -> emp.getId().equals(id));
            return ResponseEntity.ok("Employee deleted");
        }
        return ResponseEntity.notFound().build();
    }
}
