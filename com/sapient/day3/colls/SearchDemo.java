package com.sapient.day3.colls;

import java.util.LinkedList;
import java.util.List;

public class SearchDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("orange");
		list.add(1, "grapes");
		
		String searchFruit = "apple";
		
		boolean result = list.contains(searchFruit);
		System.out.println(result);

	}

}
