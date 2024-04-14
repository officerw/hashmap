package hashmap;

import java.io.FileReader;
import java.util.Scanner;

public class CountChars {
	 int[] letterCount;
	public CountChars() {
		letterCount= new int[26];


	}
	
	public static int convertIndex(Character s) {
		Integer cInteger = s +0;
		if(s>= 97 && s<= 122) {
			return cInteger -97;
		}
		else if(s>= 65 && s<= 90) {
			return cInteger -65;
		}
		return -1;
		
	}
	public static void main (String args[]) {
		CountChars testr = new CountChars();
		String fileName = args[0];
		Scanner getLetters = null;
		try {
			FileReader readLetters = new FileReader(fileName);
			 getLetters = new Scanner(readLetters);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		while(getLetters.hasNext()) {
			String word = getLetters.next();
			for(int i =0; i< word.length(); i++) {
				int charector = convertIndex(word.charAt(i));
				if(charector != -1 ) {
					testr.letterCount[charector] +=1;
				}
				else {
					continue;
				}
			}
		}
		for (int i =0 ; i<testr.letterCount.length; i++) {
			System.out.println(testr.letterCount[i]);
		}
	}
}
