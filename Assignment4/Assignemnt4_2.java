package com.Ineuron.Assignment4;

import java.util.HashMap;
import java.util.*;

public class Assignemnt4_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String::");
		String str = sc.next();
		System.out.println("Duplicates Present in the String::");
		printDuplicate(str);
	}

	static void printDuplicate(String str) {
		HashMap<Character, Integer> count = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!count.containsKey(str.charAt(i)))
				count.put(str.charAt(i), 1);
			else
				count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
		}

		for (Map.Entry mapElement : count.entrySet()) {
			char key = (char) mapElement.getKey();
			int value = ((int) mapElement.getValue());

			if (value > 1)
				System.out.println(key);
		}
	}

}
/*OUTPUT----
Enter the String::
ineuron
Duplicates Present in the String::
n
*/
  
