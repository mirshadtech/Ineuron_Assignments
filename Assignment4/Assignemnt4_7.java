package com.Ineuron.Assignment4;

import java.util.Scanner;

public class Assignemnt4_7 {

	public static boolean uniqueCharacters(String str)
    {
       
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
 
        return true;
    }
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
 
        if (uniqueCharacters(s))
            System.out.println("The String " + s + " has all unique characters");
        else
            System.out.println("The String " + s + " has duplicate characters");
    }

}
/*OUTPUT----
Enter the String:
ineuron
The String ineuron has duplicate characters 
 */
 