package com.Ineuron.Assignment4;

import java.util.Scanner;

public class Assignemnt4_4 {

	// Driver function.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("Character Count from String::");
		getCharactercount(str);
	}

	public static void getCharactercount(String str) {

		int vowels = 0, consonant = 0, specialChar = 0, digit = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

				ch = Character.toLowerCase(ch);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonant++;
			} else if (ch >= '0' && ch <= '9')
				digit++;
			else
				specialChar++;
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonant: " + consonant);
		System.out.println("Digit: " + digit);
		System.out.println("Special Character: " + specialChar);
	}

}
/*OUTPUT----
Enter the String:
Ineuron Assignment4@completed
Character Count from String::
Vowels: 10
Consonant: 16
Digit: 1
Special Character: 2
*/
  
