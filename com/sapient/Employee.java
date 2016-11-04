package com.sapient;

public class Employee {
	int id;
	String name;
	Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		Address add = new Address(23,"GK", "Delhi", 345435);
		
		Employee emp = new Employee(123, "Ravi", add);
		System.out.println(emp);
	}
	
}
