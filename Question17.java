package com.training;

import java.util.ArrayList;
import java.util.List;

public class Question17 {
	
	//Question 17: Write a method that combines two lists, e.g [a,b,c], [d,e,f] -> [a,b,c,d,e,f] 
	List<Object> abc = new ArrayList<Object>();
	List<Object> def = new ArrayList<Object>();
	
	public void abcdef(){
		
		for(int i=0; i<def.size(); i++){
			
			Object abcdef = abc.add(def.get(i));

		}
		
		for(int i=0; i<abc.size(); i++){
			
			System.out.println(abc.get(i));
		}
	}
	

	public static void main(String[] args) {
		
		Question17 qs = new Question17();
		qs.abc.add(1);
		qs.abc.add(2);
		qs.abc.add(3);
		qs.def.add(4);
		qs.def.add(5);
		qs.def.add(6);
		qs.abcdef();
	}

}
