package com.Ineuron.Assignment4;

import java.util.*;

public class Assignemnt4_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		System.out.println("Max occurring character is: " + getMaxOccurringChar(str));
	}

	public static char getMaxOccurringChar(String str) {

		HashMap<Character, Integer> mp = new HashMap<>();

		int n = str.length();
		char ans = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {

			char c = str.charAt(i);
			mp.put(c, mp.getOrDefault(c, 0) + 1);

			if (cnt < mp.get(c)) {
				ans = c;
				cnt = mp.get(c);
			}
		}

		return ans;
	}

}
/*OUTPUT-
Enter the String:
ineuron
Max occurring character is: n
*/
