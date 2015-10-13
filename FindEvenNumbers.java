package com.training.findEvenNumbersAndJUnitTest;

import java.util.ArrayList;
import java.util.List;

public class FindEvenNumbers {
	
	double a = Math.round(Math.random()*100);
	double b = Math.round(Math.random()*100);
	
	List<Integer> evenNumbers = new ArrayList<Integer>();
	
	public void evenNumber(){
		
		if(a>b){
			double c=a;
			a=b;
			b=c;
		}
		
		for(int i=(int) a+1; i<b; i++){
			
			if(i%2==0)
				evenNumbers.add(i);
		}
		
		if(evenNumbers.size()!=0){
			System.out.println("Even numbers between "+a+" and "+b+": ");
			for(Integer evenNumber : evenNumbers){
				System.out.print(evenNumber+", ");
			}
		} else {
			
			System.out.println("There is no even numbers betwwen "+a+" and "+b+".");
		}
	}
}
