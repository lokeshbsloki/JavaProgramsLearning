package StringPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringPrograms {

	public static void main(String[] args) {

		TIACstring();
		System.out.println();
		
		reversestring();
		System.out.println();
		
		removeJunk();
		charactersCount();
		
		charOccurance("anushaloveyouanusha");
		System.out.println();
		
		wordOccurance("anusha i l you anusha l");
		System.out.println();
		
		substringInaString("anusha i l you", "l");
		System.out.println();
		
		vowelsDigitCount("anusha dont 143 misunderstand me with 341 my words");
		System.out.println();
		
		reverseWordsInaString("anusha are you smiling now after reading string values");
		System.out.println();
		
		removeVowels("anusha we should clear this interview");

	}

//input=This is a cat
//output=T.I.A.C.	
	public static void TIACstring() {

		String input = "anusha i l you";
		System.out.println(input);
		String[] array = input.split(" ");
		for (int i = 0; i < array.length; i++) {

			String word = array[i];
			char firstletter = word.charAt(0);
			System.out.print(Character.toUpperCase(firstletter) + ".");
		}
	}

	// input=lokesh
	// output=hsekol
	public static void reversestring() {

		System.out.println();
		String input = "anushailyou";
		System.out.println(input);
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println("reverse of name is = " + rev);
	}

	// input=%$#%%^$ hi lokesh 12345
	// output=hi lokesh 12345
	public static void removeJunk() {

		String s1 = "%$#%%^$ hi lokesh 12345";
		System.out.println("before = " + s1);
		s1 = s1.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("after = " + s1);
		System.out.println(s1.trim());
	}

	public static void charactersCount() {

		System.out.println();
		String str = "hello anusha how r u";
		System.out.println(str);
		str = str.replaceAll("[^a-zA-Z]", "");
		char[] ch = str.toCharArray();
		System.out.println("char count = " + ch.length);

	}

	public static void charOccurance(String str) {

		int count;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char character : str.toCharArray()) {

			if (map.containsKey(character)) {
				count = map.get(character);
				map.put(character, count + 1);

			} else {
				map.put(character, 1);
			}
		}
		for (Entry<Character, Integer> map1 : map.entrySet()) {
			System.out.println(map1.getKey() + ":" + map1.getValue());
		}

	}

	public static void wordOccurance(String str) {

		int count;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] words = str.split(" ");

		for (String word : words) {

			if (map.containsKey(word)) {
				count = map.get(word);
				map.put(word, count + 1);

			} else {
				map.put(word, 1);
			}
		}
		for (Entry<String, Integer> map1 : map.entrySet()) {
			System.out.println(map1.getKey() + ":" + map1.getValue());
		}

	}

	public static void substringInaString(String str, String substring) {

		int index = str.indexOf(substring);
		if (index != -1) {
			System.out.println("Index of this word : " + index);
		} else {
			System.out.println("The input sub-string is not found in the string.");
		}

	}

	public static void vowelsDigitCount(String str) {

		int vowelcount = 0;
		int digitcount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
					|| c == 'u') {

				vowelcount++;
			} else if (Character.isDigit(c)) {
				digitcount++;
			}
		}
        System.out.println("No of vowels = "+vowelcount);
        System.out.println("No of numbers = "+digitcount );
	}
	
	public static void reverseWordsInaString(String str) {
		System.out.println("before ="+str);
		String[] str1 = str.split(" ");
		
		StringBuilder rsb=new StringBuilder();
		
		for(String word:str1) {
			
			if(!word.equals(" ")) {
				
				StringBuilder tsb=new StringBuilder(word);
				String rev = tsb.reverse().toString();
				rsb=rsb.append(rev+" ");
			}
		}
		
		System.out.println("after = "+rsb.toString());
	}

	public static void removeVowels(String str) {
		String str1 = str;
		str1=str1.replaceAll("[aeiouAEIOU]", "");
		System.out.println("first "+str1);
		String vowels="aeiouAEIOU";
		String res="";
		for(int i=0;i<str.length();i++) {
			if(!vowels.contains(String.valueOf(str.charAt(i)))) {
				res=res+str.charAt(i);
			}
		}
		System.out.println("second "+res);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
