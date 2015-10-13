package com.training;

public class Question6_to_10 {

	public static void main(String[] args) {

		// Question 6: Write a program to print multiples of 5 between 1 and 100
		// i.e 5,10,15,20..100
		int multiple = 0;
		do {
			multiple += 5;
			System.out.print(multiple + ", ");
		} while (multiple < 100);
		System.out.println();

		// Question 7: Write a program to print the sum of multiples of 5
		// between 1 and 100

		multiple = 0;
		int sum = 0;
		do {
			multiple += 5;
			sum += multiple;
			System.out.print(sum + ", ");
		} while (multiple < 100);
		System.out.println();

		// Question 8: Write a program to print sum of the numbers between 1 and
		// 100

		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.print(sum + ",");
		System.out.println();

		// Question 9: Write a program that prints a multiplication table for 8

		multiple = 0;
		for (int i = 1; i <= 10; i++) {
			multiple = 8 * i;
			System.out.println("8 x " + i + " = " + multiple);

		}

		// Question 10: Write a program that prints next 10 leap years starting
		// from current year
		int year= 2015;
		
		for (int i = 1; i <= 10; i=i) {
			
			if (year % 4 == 0) {
				System.out.print(year + ",");
				i=i+1;
			}
			year =year+1;
			
		}
		
		System.out.println();
		
	}

}
