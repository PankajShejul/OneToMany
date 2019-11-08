package com.session.firstDemo.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id;
	@Column(name="firstname")
	public String firstName;
	@Column(name="lastname")
	public String lastName;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private List<Timesheet> timesheets;
	
	public Employee() {
		super();
	}
	
	
	

	public Employee(String firstName, String lastName, List<Timesheet> timesheets) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.timesheets = timesheets;
	}




	public List<Timesheet> getTimesheets() {
		return timesheets;
	}




	public void setTimesheets(List<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", timesheets="
				+ timesheets + "]";
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
