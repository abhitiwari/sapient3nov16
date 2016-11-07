package com.sapient.day3.colls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sapient.day2.oops.Employee;

public class SortDemo {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(101, "Ravi", 14545));
		employees.add(new Employee(121, "Priya", 34545));
		employees.add(new Employee(103, "Rahul", 15545));
		
		System.out.println(employees);
		
//		Collections.sort(employees);
		Comparator c = new SalaryComparator();
		Collections.sort(employees, c);
		
		System.out.println(employees);
		
		/*List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");

		System.out.println(fruits);
		
		Collections.sort(fruits);
		
		System.out.println(fruits);*/
	}

}
