package ArraysStrings;

public class WhiteSpaceReplacer {
	
	String string;
	String string1;
	
	public void spaceReplacer (String string, String stringToReplace, String stringReplacer){	
		
		string1=string.replace(stringToReplace, stringReplacer);
		System.out.print(string1);
		
	}
	
	public static void main(String[] args) {
		
		WhiteSpaceReplacer wsr = new WhiteSpaceReplacer();
		
		wsr.spaceReplacer("       ", " ", "%20");
	}

}
