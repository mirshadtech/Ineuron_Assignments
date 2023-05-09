package com.Ineuron.Assignment4;

import java.util.Scanner;

public class Assignemnt4_6 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		isPangram(str);
	}

	public static void isPangram(String str) {

		str = str.toLowerCase();

		boolean allLetterPresent = true;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (!str.contains(String.valueOf(ch))) {
				allLetterPresent = false;
				break;
			}
		}

		if (allLetterPresent)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");
	}

}
/*OUTPUT--
Enter the String:
Abcdefghijklmnopqrstuvwxyz12
Pangram
 
*/