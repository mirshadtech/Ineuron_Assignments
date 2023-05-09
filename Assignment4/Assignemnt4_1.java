package com.Ineuron.Assignment4;

import java.util.Scanner;

public class Assignemnt4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String::");
		String s = sc.next();
		
        System.out.println("After Removing Duplicate::");
		System.out.println(RemoveDuplicate(s));
	}

	public static String RemoveDuplicate(String s) {
		String str = new String();
		int len = s.length();

		for (int i = 0; i < len; i++) {

			char c = s.charAt(i);

			if (str.indexOf(c) < 0) {

				str += c;
			}
		}

		return str;
	}

}
/*OUTPUT------
Enter the String::
ineuron
After Removing Duplicate::
ineuro
 */

