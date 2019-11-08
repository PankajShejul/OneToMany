package com.session.firstDemo.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.session.firstDemo.model.Employee;
import com.session.firstDemo.model.Timesheet;

@Repository
public class EmployeeRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Employee> getAll() {
		return entityManager.createQuery("Select e from Employee e",Employee.class).getResultList();
			
	}
	
	public void getFirstNameById() {
		System.out.println(entityManager.find(Employee.class, 1));
	}
	
	public Employee findById(Integer id) {
		
		Employee emp=entityManager.find(Employee.class, id);
		System.out.println(emp);
		return emp;
	}
	public Employee findByFirstName(String fName)
	{
		return (Employee) entityManager.createQuery("Select e from Employee e where e.firstName=: fName").setParameter("fName", fName).getSingleResult();
	}
	
	public void insert(Employee employee) {
		entityManager.persist(employee);
	}
	public void init() {
		List<Timesheet> list=new ArrayList<Timesheet> ();
		list.add(new Timesheet("java","java"));
		entityManager.persist(new Employee("abc","abc",list));
		getFirstNameById();
	}
}
