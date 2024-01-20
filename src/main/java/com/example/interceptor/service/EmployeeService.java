package com.example.interceptor.service;

import com.example.interceptor.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    public ResponseEntity<Employee> getEmployees();
}
