package com.sapient.day3;

public class TypeCastingDemo {

	public static void main(String[] args) {
		MountainBicycle rb = new MountainBicycle(20);
		
		Object b = rb;

		
		if (b instanceof RoadBicycle){
			RoadBicycle rb2 = (RoadBicycle)b;
			System.out.println(rb2);
			
		}
		
		
	}

}
