package com.bootwithrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bootwithrest.dto.Employeedto;
import com.bootwithrest.entites.Employee;

@Service
public interface EmployeeService {
    
    public Employee updateEmployee(Employee emp);
    public Employeedto getEmployee(int empId);
    public void deleteEmployee(int empId);
   
}