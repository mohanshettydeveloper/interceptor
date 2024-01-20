package com.example.interceptor.service;

import com.example.interceptor.model.Employee;
import com.example.interceptor.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public ResponseEntity<Employee> getEmployees() {
        Optional<Employee> employee = getEmployee();
        return new ResponseEntity<>(employee.get(), HttpStatus.OK);
    }

    private Optional<Employee> getEmployee() {
        return employeeRepository.findById(1);
    }
}
