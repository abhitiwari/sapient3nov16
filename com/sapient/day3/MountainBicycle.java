package com.sapient.day3;

public class MountainBicycle extends Bicycle {
	MountainBicycle(int speed){
		super(speed);
	}
	@Override
	public void speedUp(){
		this.speed+=2;
	}
	@Override
	public void changeGear() {
		System.out.println("Changing gear for Mountain Bicycle");
		
	}
	
}
