package com.example.interceptor.service;

import com.example.interceptor.model.Employee;
import com.example.interceptor.model.FeatureFlags;
import com.example.interceptor.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    FeatureFlags featureFlags;

    public ResponseEntity<List<Employee>> getEmployees() {
/*
        Optional<Employee> employee = getEmployee();
        return new ResponseEntity<>(employee.get(), HttpStatus.OK);
*/
        System.out.println("feature flags:" + featureFlags.toString());
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Optional<Employee>> getEmployee(int id) {
        return new ResponseEntity<>(employeeRepository.findById(id), HttpStatus.OK);
    }
}
