package com.sapient.day3;

public class RoadBicycle extends Bicycle {
	public RoadBicycle(int speed){
		super(speed);
	}
	@Override
	public void speedUp(){
		this.speed+=1;
	}
	
	@Override
	public void changeGear() {
		System.out.println("Changing gear for Road Bicycle");
		
	}
	/*@Override
	public void brakeDown(){
		this.speed-=1;
	}*/

	
}
