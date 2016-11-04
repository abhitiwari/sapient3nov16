package com.sapient.day2.oops;

public class Manager extends Employee {
	int numberOfEmployees;
	
	Manager(int id, String name, double salary,int numberOfEmployees){
//		super();
		super(id,name,salary);
		/*this.id = id;
		this.name = name;
		this.salary = salary;*/
		this.numberOfEmployees = numberOfEmployees;
		
	}
	
	public void m1(){
		super.toString();
	}
	

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	

}
