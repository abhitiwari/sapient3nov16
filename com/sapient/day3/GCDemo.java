package com.sapient.day3;

public class GCDemo {

	public static void main(String[] args) throws InterruptedException {
		String str = "";
		for(int i =0;i<1000000000;i++){
			str = str +i;
			Thread.sleep(2);
			//System.out.println(str);
		}

	}

}
