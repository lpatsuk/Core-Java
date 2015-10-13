package com.training;

import java.util.ArrayList;
import java.util.List;

public class Question13 {
	
	//Question 13: Write a method to accept list of ints as input and return the sum of those ints
	
	List<Integer> numbers = new ArrayList<Integer>();
	
	public void sumOfNumbers(){
		
		int sum = 0;
		for(int i=0; i<numbers.size(); i++){
			
			sum = sum + numbers.get(i);		
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Question13 qt = new Question13();
		qt.numbers.add(1);
		qt.numbers.add(2);
		qt.numbers.add(3);
		qt.numbers.add(4);
		qt.sumOfNumbers();
	}

}
