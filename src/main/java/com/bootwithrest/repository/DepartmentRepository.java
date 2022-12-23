package com.bootwithrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootwithrest.entites.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Integer>{

}
