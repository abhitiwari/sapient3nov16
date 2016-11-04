package com.sapient.day2.oops;

public class TestPolymorphism {

	public static void main(String[] args) {
		Employee e1 = new Employee(3456, "Rahul");
		e1.setSalary(34354.45);
		
		Employee e = new Employee(101, "Ravi", 34653.34);
		
		Manager m = new Manager(102, "Amit", 34555.34, 4);
		
		Employee employees[] = {e, m};
		
		for(Employee emp: employees){
			System.out.println(emp.toString("Employees"));
			emp.incrementSalary();
			System.out.println("After Increment: " + emp);
		}

	}

}
