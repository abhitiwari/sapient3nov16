package com.sapient.day3.colls;

import java.util.LinkedList;
import java.util.List;

import com.sapient.day2.oops.Employee;

public class SearchDemo2 {

	public static void main(String[] args) {
		List<Employee> employees = new LinkedList<Employee>();
		employees.add(new Employee(101, "Ravi", 34545));
		employees.add(new Employee(102, "Priya", 34545));
		employees.add(new Employee(103, "Rahul", 34545));
		
		Employee searchEmployee = new Employee(102, "Priya", 34545);
		
		boolean result = employees.contains(searchEmployee);
		System.out.println(result);

	}

}
