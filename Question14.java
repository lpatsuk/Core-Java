package com.training;

import java.util.ArrayList;
import java.util.List;

public class Question14 {
	
	//Write a method to accept list of Strings and return another list 
	//that contains only in odd positions
	
	List<String> strings = new ArrayList<String>();
	List<String> oddPositionStrings = new ArrayList<String>();
	
	public void oddPositionStrings(){
		
		for(int i=1; i<strings.size(); i=i+2){
			
			oddPositionStrings.add(strings.get(i));
		}
		
		for(int i=0; i<oddPositionStrings.size(); i++){
			
			System.out.println(oddPositionStrings.get(i));
		}
	}
	

	public static void main(String[] args) {
		
		Question14 qf = new Question14();
		
		qf.strings.add("0");
		qf.strings.add("1");
		qf.strings.add("2");
		qf.strings.add("3");
		qf.strings.add("4");
		qf.strings.add("5");
		qf.oddPositionStrings();
	}

}
