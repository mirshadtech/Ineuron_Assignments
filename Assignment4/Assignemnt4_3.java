package com.Ineuron.Assignment4;

public class Assignemnt4_3 {

	public static void main(String[] args) {

		String st = "2552";
		if (checkPalindrome(st) == true)
			System.out.print("Palindrome..");
		else
			System.out.print("Not a Palindrome..");
	}

	public static boolean checkPalindrome(String str) {

		int len = str.length();

		for (int i = 0; i < len / 2; i++) {

			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
		}

		return true;
	}

}
/*OUTPUT----
Palindrome..
*/
  