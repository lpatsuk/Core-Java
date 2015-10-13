package com.training;

import java.util.ArrayList;
import java.util.List;

public class Question16 {
	
	//Write a method to accept list of ints as input and return the output list with their squares
	
	List<Integer> numbers = new ArrayList<Integer>();
	List<Integer> squaresOfNumbers = new ArrayList<Integer>();
	
	public void squaresOfNumbers(){
		
		for(int i=0; i<numbers.size(); i++){
			squaresOfNumbers.add(numbers.get(i)*numbers.get(i));
		}
		
		for(int i=0; i<squaresOfNumbers.size(); i++){
			
			System.out.println(squaresOfNumbers.get(i));
		}
	}

	public static void main(String[] args) {
		
		Question16 q16 = new Question16();
		q16.numbers.add(1);
		q16.numbers.add(2);
		q16.numbers.add(3);
		q16.numbers.add(4);
		q16.numbers.add(5);
		q16.squaresOfNumbers();
	}

}
