package com.example.interceptor.service;

import com.example.interceptor.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

    public ResponseEntity<List<Employee>> getEmployees();

    public ResponseEntity<Optional<Employee>> getEmployee(int id);
}
