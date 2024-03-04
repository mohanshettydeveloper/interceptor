package com.example.interceptor.controller;

import com.example.interceptor.model.Employee;
import com.example.interceptor.service.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class EmployeeController {

    private EmployeeServiceImpl employeeService;

    @GetMapping(value = "/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping(value = "/employees/{id}")
    public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }
}
