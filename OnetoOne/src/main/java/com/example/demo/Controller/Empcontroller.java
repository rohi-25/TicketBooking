package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.Empservice;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController


public class Empcontroller {

	@Autowired
	
	Empservice sobj;
	@Tag(name="Post",description="Posting details")
	@PostMapping("/postdetails")
	public Employee add(@RequestBody Employee sobj1 )
	{
		return sobj.addPerson(sobj1);
	}
	@Tag(name="Get",description="Getting details")
	@GetMapping("/getdetails")
	public List <Employee> get()
	{
		return sobj.getPerson();
	}
		
	

}
