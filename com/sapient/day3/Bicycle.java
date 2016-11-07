package com.sapient.day3;

public abstract class Bicycle implements IBycycle {
	
	int speed;

	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}
	
	public abstract void speedUp();
	public  void brakeDown(){
		this.speed-=1;
	}

	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + "]";
	}
	
	

}
