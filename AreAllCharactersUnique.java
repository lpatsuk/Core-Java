package ArraysStrings;

public class AreAllCharactersUnique {
	
	public void checkCharaacters(String string){
		
		Character c;
		
		for(int i = 1; i < string.length(); i++){
			
			for(int y = 0; y<i; y++){	
				c = string.charAt(i);
				if(c.equals(string.charAt(y))){
					System.out.println("Character \""+string.charAt(i)+"\" in position "+(i+1)+""
							+ " is not unique and is equal to character \""+string.charAt(y)+
							"\" in position "+(y+1)+".");
				}
			}
		}
		
		//System.out.println("All other characters are unique.");
	}
	public static void main(String[] args) {
		
		AreAllCharactersUnique acu = new AreAllCharactersUnique();
		acu.checkCharaacters("tabakerka");
	}

}
