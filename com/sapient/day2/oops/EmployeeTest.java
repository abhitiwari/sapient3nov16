package com.sapient.day2.oops;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Ravi", 34545);
		System.out.println(emp);
		
//		emp.salary = -34545;
		emp.setSalary(-24354);
		
		System.out.println(emp);

	}

}
