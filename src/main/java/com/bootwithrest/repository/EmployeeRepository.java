package com.bootwithrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootwithrest.dto.Employeedto;
import com.bootwithrest.entites.Employee;

@Repository
public interface EmployeeRepository extends  JpaRepository<Employee, Integer> {

}
