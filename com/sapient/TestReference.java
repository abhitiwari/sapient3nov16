package com.sapient;

class Num{
	int x;
	Num(int x){
		this.x = x;
	}
}

public class TestReference {
	
	public static void changeNumber(int x){
		x = x + 10;
	}
	
	public static void changeNumber(Num num){
		num.x = num.x + 10;
	}

	public static void main(String[] args) {
//		int x = 10;
		Num num = new Num(10);
		System.out.println("Before: " + num.x);
		changeNumber(num);
		System.out.println("After: " + num.x);

	}

}
