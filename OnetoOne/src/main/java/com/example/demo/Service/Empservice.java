package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.Employeerepo;

@Service

public class Empservice {

	@Autowired
	Employeerepo robj;
	public Employee addPerson(Employee sobj1) {
		
		return  robj.save(sobj1);
	}

	public List<Employee> getPerson() {
		return robj.findAll();
	}
}
