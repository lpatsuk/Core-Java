package com.training;

public class Question15 {
	
	//Write a method to test whether a given String is palindrome or not. Palindrome words
	//has the same characters in forward and backward direction.
    //For example, "racecar" is a palindrome.
	
	public void isWordPalindrome(String word){

		char[] wordToChar = word.toCharArray();
				
		char[] wordToChar1 = new char[wordToChar.length];
		
		for(int i = 0; i < wordToChar1.length; i++){
			wordToChar1[i] = wordToChar[wordToChar1.length - i - 1];
		}
		
		StringBuilder charToString = new StringBuilder();
		
		for(int i = 0; i < wordToChar1.length; i++){
			charToString.append(wordToChar1[i]);
		}
		
		String word1 = charToString.toString();		
		
		if(word.hashCode() == word1.hashCode() && word.equals(word1)){
			System.out.println("The word \"" + word + "\" is a palindrome.");
		} else {
			System.out.println("The word " + word + " is not a palindrome.");
		}
	}

	public static void main(String[] args) {
		
		Question15 qstn = new Question15();
		qstn.isWordPalindrome("carac");
	}

}
