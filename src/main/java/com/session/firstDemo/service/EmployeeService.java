package com.session.firstDemo.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.session.firstDemo.model.Employee;
import com.session.firstDemo.repository.EmployeeRepository;

@Transactional
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	
	public void init() {
		repository.init();
		
	}
	
	public List<Employee> getAll(){
		return repository.getAll();
	}
	
	public Employee findById(Integer id) {
		return repository.findById(id);
	}
	public void insert(Employee employee) {
		repository.insert(employee);
	}
	public Employee findByFirstName(String firstName) {
		
		return repository.findByFirstName(firstName);
	}
}
