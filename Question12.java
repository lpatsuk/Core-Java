package com.training;

import java.util.ArrayList;
import java.util.List;

public class Question12 {
	
	// Write a method to accept list of Strings as input 
	//and return a list of Strings in exactly reverse order
	
	List<String> strings = new ArrayList<String>();
	List<String> reversStrings = new ArrayList<String>();
	
	public void reversStrings(){
		
			for(int i=strings.size()-1; i>=0; i--){
				
				String aReversedString = strings.get(i);
				System.out.println(aReversedString+", ");
			}
			
	}

	public static void main(String[] args) {
		
		Question12 qt = new Question12();
		qt.strings.add("One");
		qt.strings.add("Two");
		qt.strings.add("Three");
		qt.strings.add("Four");
		
		qt.reversStrings();
	}

}
