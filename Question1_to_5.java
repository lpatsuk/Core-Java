package com.training;

public class Question1_to_5 {
	
	public static void main(String[] args) {
		//Question 1: Write numbers from 1 to 10 in one line i.e 1,2,3,4..10
		for(int i=1; i<10; i++){
			System.out.print(i+",");
			
		}
		
		System.out.println(10);
		//Question 2: Write numbers from 1 to 10 by skipping 1 i.e 1,3,5,7,9
		for(int i=1; i<11; i++){
			if(i<9){
				System.out.print(i+",");
			} else {
				System.out.println(i);
			}
			i++;
		}
		//Question 3:  Write even numbers from 1 to 50 in one line i.e 2,4,6,8..50
		
		for(int i=2; i<=50; i++){
			if(i<50){
				System.out.print(i+",");
			} else {
				System.out.println(i);
			}
			i++;
		}
		
		//Question 4:  Write odd numbers from 1 to 50 in one line i.e 1,3,5,7..49
		
		for(int i=1; i<50; i++){
			if(i<49){
				System.out.print(i+",");
			} else {
				System.out.println(i);
			}
			i++;
		}
		
		//Question 5: Write the prime numbers between 1 and 100. 
		//Prime number is a number that has only 1 and itself as factors.
		int i=0;
		int num=0;
		
		for( i=1; i<=100; i++){
			
			int counter=0;
			
			for( num=i; num>=1; num--){
				if(i%num==0){
					
					counter = counter++;
				}
				
			}
				if(counter==2){
					System.out.print(i+",");
				}
			
			
		}
		String  primeNumbers = "";
		for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   
	}

}
