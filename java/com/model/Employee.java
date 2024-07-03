package com.model;
import jakarta.persistence.*;
@Entity
@Table (name="Studentdata")
public class Employee {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Empid;
	String name,designation;
	float salary;
	
	
	public Employee(String name, String designation,float salary) {
	
		this.name=name;
		this.designation=designation;
		this.salary=salary;// TODO Auto-generated constructor stub
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return Empid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}