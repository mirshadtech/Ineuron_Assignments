package com.Ineuron.Assignment4;

import java.util.Scanner;

public class Assignemnt4_5 {

	static int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String:");
		String s1=sc.next();
		System.out.println("Enter Second String:");
		String s2=sc.next();
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();

		if (areAnagram(str1, str2))
			System.out.print("The two strings are " + "anagram of each other");
		else
			System.out.print("The two strings are " + "not anagram of each other");
	}

	static boolean areAnagram(char[] str1, char[] str2) {

		int[] count = new int[NO_OF_CHARS];
		int i;

		if (str1.length != str2.length)
			return false;

		for (i = 0; i < str1.length; i++) {
			count[str1[i]]++;
			count[str2[i]]--;
		}

		for (i = 0; i < NO_OF_CHARS; i++)
			if (count[i] != 0) {
				return false;
			}
		return true;
	}

}
/*OUTPUT--
Enter First String:
race
Enter Second String:
care
The two strings are anagram of each other
*/
 

