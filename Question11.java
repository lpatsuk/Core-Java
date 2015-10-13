package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question11 {

	// Question 11: Write a method to accept list of ints as input and
	// return largest number in that list.
	List<Integer> numbers = new ArrayList<Integer>();

	public int returnLargestNumber() {

		int maxNumber = 0;
		for (int i = 0; i < numbers.size(); i++) {
			int aNumber = numbers.get(i).intValue();
			if (i == 0) {
				maxNumber = aNumber;
			} else if (aNumber > maxNumber) {
				maxNumber = aNumber;
			}

		}

		System.out.println("Max number = " + maxNumber);
		return maxNumber;

	}
	
	public static void main(String[] args) {

		Question11 qe = new Question11();
		qe.numbers.add(-45);
		qe.numbers.add(-35);
		qe.numbers.add(-25);
		qe.numbers.add(-15);
		qe.returnLargestNumber();

	}

}
