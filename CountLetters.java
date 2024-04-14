package hashmap;

import java.io.FileReader;
import java.util.Scanner;

public class CountLetters {
	private Pair [] pairs;
	
	public CountLetters() {
		pairs = new Pair[26];
	}
	
	public int find(char ch) {
		for (int i = 0; i < pairs.length; i++) {
			if (pairs[i] == null) {
				return i;
			}
			else if (pairs[i].getKey() == ch) {
				return i;
			}
		}
		return -1;
	}
	
	public int put(char ch, int v) {
		int index = find(ch);
		
		if (index == -1) {
			rehash();
			return -1;
		}
		else if (pairs[index] == null) {
			pairs[index] = new Pair(ch, v);
			return v;
		}
		else {
			int prevValue = pairs[index].getValue();
			pairs[index].setValue(v + prevValue);
			return prevValue;
		}
	}
	
	public int get(char ch) {
		for (int i = 0; i < pairs.length; i++) {
			if (pairs[i].getKey() == ch) {
				return pairs[i].getValue();
			}
		}
		return -1;
	}
	
	public void rehash() {
		Pair [] old = pairs;
		pairs = new Pair[old.length * 2];
		for (int i = 0; i < old.length; i++) {
			pairs[i] = old[i];
		}
	}
	
	public Pair[] getArray() {
		return pairs;
	}
	
	public static void main (String args[]) {
		CountLetters testr = new CountLetters();
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
				if(charector != -1 ) {
					testr.put(word.charAt(i), );
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
