package com.sapient.day3.colls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.sapient.day3.RoadBicycle;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("orange");
		list.add(1, "grapes");
	/*	list.add(12);
		list.add(new RoadBicycle(23));*/
		
		for(String fruit: list){
			System.out.println(fruit);
		}
		
		System.out.println(list.get(1));
	}

}
