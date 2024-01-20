package com.example.interceptor.controller;

import com.example.interceptor.model.Employee;
import com.example.interceptor.service.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private EmployeeServiceImpl employeeService;
    @GetMapping(value = "/employees")
    public ResponseEntity<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
