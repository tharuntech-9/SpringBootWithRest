package com.bootwithrest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootwithrest.entites.Department;
import com.bootwithrest.entites.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employeedto {
	private int empId;
	private String employeeName;
	private String emailID;
	private String department;	
}
