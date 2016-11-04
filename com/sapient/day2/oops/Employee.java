package com.sapient.day2.oops;

public class Employee {
	protected int id;
	protected String name;
	protected double salary;
	
	/*public void setSalary(double salary){
		if(salary>0){
			this.salary = salary;
		}
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0){
			this.salary = salary;
		}
	}
	
	
	public Employee(int id, String name) {
//		super();
		this.id = id;
		this.name = name;
		
	}
	
	public Employee(int id, String name, double salary) {
		this(id, name);
		/*this.id = id;
		this.name = name;*/
		this.salary = salary;
	}
	
	public void incrementSalary(){
		this.salary *=1.1;
	}
	
	public String toString(String className){
		return className + " [id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
