package com.session.firstDemo.model;

import javax.persistence.*;

@Entity
@Table(name="timesheet")
public class Timesheet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="subject")
	private String subject;
	@Column(name="description")
	private String description;
	
//	@ManyToOne  
//	@JoinColumn(name="employee_id") 
//	private Employee employee;
//	
	public Timesheet() {
		super();
	}


	public Timesheet( String subject, String description) {
		super();
		
		this.subject = subject;
		this.description = description;
	}


	

	/*
	 * public Employee getEmployee() { return employee; }
	 * 
	 * 
	 * public void setEmployee(Employee employee) { this.employee = employee; }
	 */


	@Override
	public String toString() {
		return "Timesheet [id=" + id + ", subject=" + subject + ", description=" + description + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
