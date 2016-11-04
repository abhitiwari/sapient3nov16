package com.sapient.day2.oops;

class Vehicle{
	int maxSpeed;
    public Vehicle(){}
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public  void start(){
		System.out.println("Starting vehicle...");
	}
	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + "]";
	}
	
	
}

class Plane extends Vehicle {
	int maxAltitue;
	public Plane(int maxAltitue, int speed) {
		this.maxAltitue = maxAltitue;
		this.maxSpeed = speed;
	}
	public void start(){
		System.out.println("Starting plane...");
	}

	@Override
	public String toString() {
		return "Plane [maxAltitue=" + maxAltitue + ", maxSpeed=" + maxSpeed + "]";
	}

	
}

public class InheritanceDemo {
	
	public static void printVehicleState(Vehicle v){
		System.out.println(v);
	}
	
	/*public static void printVehicleState(Plane p){
		System.out.println(p);
	}*/

	public static void main(String[] args) {
		
		
		Vehicle v = new Vehicle(300);
		System.out.println(v.maxSpeed);
		v.start();
		printVehicleState(v);
		
		Plane p = new Plane(10000,900);
		System.out.println(p.maxSpeed);
		System.out.println(p.maxAltitue);
		p.start();
		printVehicleState(p);
		
		Vehicle v1 = new Plane(12000,1000);
		
		Vehicle vehicles[] = {v, p, v1};
		
		for(Vehicle vehicle: vehicles){
			vehicle.start();
			printVehicleState(vehicle);
		}
		
		
	}
}
