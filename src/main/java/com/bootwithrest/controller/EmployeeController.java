package com.bootwithrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootwithrest.dto.Employeedto;
import com.bootwithrest.entites.Department;
import com.bootwithrest.entites.Employee;
import com.bootwithrest.repository.DepartmentRepository;
import com.bootwithrest.repository.EmployeeRepository;
import com.bootwithrest.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
    @Autowired
    private EmployeeService employeeService;
       
    @GetMapping(path = "/getdetails/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employeedto> getEmployee(@PathVariable(value = "empId") int empId) {
        return new ResponseEntity<Employeedto>(employeeService.getEmployee(empId), HttpStatus.OK);
    }
   
    @PutMapping(path = "/update" ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
        return new ResponseEntity<>(employeeService.updateEmployee(emp), HttpStatus.CREATED);
    }
    @DeleteMapping(path = "/delete/{empId}" ,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteEmployee(@PathVariable(value = "empId") int empId) {
        employeeService.deleteEmployee(empId);
        return new ResponseEntity<>("EmployeeId : " + empId + " deleted successfully", HttpStatus.OK);
    }
  
    @PostMapping(path = "/newemployee" ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Employee> newEmployee(@RequestBody Employee emp) {
    	return new ResponseEntity<>(employeeService.save(emp), HttpStatus.CREATED);
    }   
   
	
}
