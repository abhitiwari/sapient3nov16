package com.sapient.day2.oops;

public class Employee implements Comparable {
	protected Integer id;
	protected String name;
	protected Double salary;
	
	/*public void setSalary(double salary){
		if(salary>0){
			this.salary = salary;
		}
	}*/
	
	public int getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
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

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		return this.id.compareTo(emp.id);
		/*if(this.id > emp.id){
			return 1;
		}
		else if(this.id < emp.id){
			return -1;
		}
		else{
			return 0;
		}*/
	}
	
	
	
	
}
