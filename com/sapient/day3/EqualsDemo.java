package com.sapient.day3;

class Fruit{
	String name;
	Fruit(String name){
		this.name = name;
	}
	@Override
	 public boolean equals(Object obj) {
	        Fruit f = (Fruit)obj;
	        return f.name.equals(this.name);
	    }
	
}

public class EqualsDemo {

	public static void main(String[] args) {
		/*String fruit1 = "Apple";
		String fruit2 = "Orange";*/
		Fruit fruit1 = new Fruit("Apple");
		Fruit fruit2 = new Fruit("Apple");
		
		System.out.println(fruit1.equals(fruit2));

	}

}
