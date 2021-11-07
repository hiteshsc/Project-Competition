// Question 3: Given a string s consists of upper/lower-case
// alphabets and empty space characters ' '
// , return the length of the
// last word in the string.
// If the last word does not exist, return 0.
// Note: A word is defined as a character sequence consisting of
// non-space characters only.
// Example:
// Given s = "Hello World"
// ,
// return 5 as length("World") = 5.

import java.util.Scanner;

class LastWordLength{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(length(s));
	}
	static int length(String s){
		s = s.trim();
		int len = 0;
		
		for(int i = s.length() -1; i >= 0; i--){
			if(s.charAt(i) == ' ')
				break;
			len++;
		}
		return len;
	}
}