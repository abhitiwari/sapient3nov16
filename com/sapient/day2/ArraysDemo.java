package com.sapient.day2;

public class ArraysDemo {

	public static void main(String[] args) {
		int []scores = {24,34,45,44};
		System.out.println(scores[1]);
		
		/*for(int i=0;i<=scores.length;i++){
			System.out.println(scores[i]);
		}*/
		
		for(int score: scores){
			System.out.println(score);
		}
		
		
		
		
		int []feedbacks = new int[10];
		feedbacks[2] = 34;
		System.out.println(feedbacks[1]);

	}

}
