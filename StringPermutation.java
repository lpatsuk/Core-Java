package ArraysStrings;

import java.util.Arrays;

public class StringPermutation {
	
	String string1;
	String string2;
	
	public boolean checkStringPermutation(String str1, String str2){
		
		String str3;
		String str4;
		
		str3 = str1.trim().replace(" ", "");
		str4 = str2.trim().replace(" ",	"");
		
		if (str3.length() != str4.length())
		      return false;

		    char[] a = str3.toCharArray();
		    char[] b = str4.toCharArray();

		    Arrays.sort(a);
		    Arrays.sort(b);
		    boolean permutation = Arrays.equals(a, b);

		    return permutation;
	}

	public static void main(String[] args) {
		
		StringPermutation sp = new StringPermutation();
		boolean permutatiion = sp.checkStringPermutation("oh   ah-", "ah- oh");
		System.out.println("Are two strings permutable? " + permutatiion); 
	}

}
