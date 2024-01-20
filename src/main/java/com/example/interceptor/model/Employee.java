package com.example.interceptor.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employee", schema = "mohan_schema")
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int emp_id;
    @Column(name = "emp_first_name")
    private String emp_first_name;
    @Column(name = "emp_last_name")
    private String emp_last_name;
    @Column(name = "emp_age")
    private int emp_age;
}
