package com.sapient.day3.colls;

import java.util.Comparator;

import com.sapient.day2.oops.Employee;

public class SalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		return e1.getSalary().compareTo(e2.getSalary());
	}

}
