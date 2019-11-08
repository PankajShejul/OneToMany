package com.session.firstDemo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.session.firstDemo.model.Employee;
import com.session.firstDemo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
	@RequestMapping("/init")
	public void init() {
		service.init();
	}
	
	@RequestMapping("/getAll")
	public List<Employee> getAll()
	{
		
		return service.getAll();
	}
	
	@RequestMapping("/findById/{id}")
	public Employee findById(@PathVariable Integer id)
	{
		System.out.println(id.getClass());
		return service.findById(id);
	}
	
	@RequestMapping("/findByFirstName/{firstName}")
	public Employee findByFirstName(@PathVariable String firstName) {
		return service.findByFirstName(firstName);
	}
	@RequestMapping(method=RequestMethod.POST,value="/insert")
	public void insert(@RequestBody Employee employee)
	{
		service.insert(employee);
		
	}
}
