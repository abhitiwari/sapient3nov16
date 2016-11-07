package com.sapient.day3;

public class TestBicycle {
	
	public static void speedUpAndBrakeDown(IBycycle bicycle){
		System.out.println(bicycle);
		bicycle.speedUp();
		System.out.println(bicycle);
		bicycle.brakeDown();
		System.out.println(bicycle);
	}

	public static void main(String[] args) {
		//Bicycle b = new Bicycle(10);
		
		Bicycle rb1 = new RoadBicycle(10);
		
		Bicycle mb1 = new MountainBicycle(10);
		
		IBycycle bicycles[] = { rb1, mb1};
		
		for(IBycycle bicycle: bicycles){
			speedUpAndBrakeDown(bicycle);
		}

	}

}
