package com.bootwithrest.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootwithrest.dto.Employeedto;
import com.bootwithrest.entites.Employee;
import com.bootwithrest.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository; 
    
    @Override
    public Employeedto getEmployee(int empId) {
    	Employeedto employeedto=null;
        Optional<Employee> optionalEmp = employeeRepository.findById(empId);
        if (optionalEmp.isPresent()) {
        	 employeedto=new Employeedto();
        	BeanUtils.copyProperties(optionalEmp, employeedto);
        }
        return employeedto;
    }
    
    @Override
    public Employee updateEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }
   
    @Override
    public void deleteEmployee(int empId) {
        employeeRepository.deleteById(empId);
    } 
    
    @Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
}
