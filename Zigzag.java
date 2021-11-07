// Question 2: The string "PAYPALISHIRING" is written in a
// zigzag pattern on a given number of rows like this: (you may
// want to display this pattern in a fixed font for better legibility)
// P.......A........H.......N
// ..A..P....L....S....I...I....G
// ....Y.........I........R
// And then read line by line: PAHNAPLSIIGYIR
// Write the code that will take a string and make this conversion
// given a number of rows:
// string convert(string text, int nRows);
// convert("PAYPALISHIRING"
// , 3) should return
// "PAHNAPLSIIGYIR"

import java.util.Arrays;
import java.util.Scanner;

class Zigzag{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		System.out.println(convert(s, sc.nextInt()));
	}
	static String convert(String s, int n){
		if(n == 1)
			return s;
		StringBuilder[] arr = new StringBuilder[n];
		for(int i = 0; i<arr.length; i++){
			arr[i] = new StringBuilder();
		}
		
		int row = 0;
		boolean down = true;
		
		for(char x: s.toCharArray()){
			arr[row].append(x);
	
			if(row == 0){
				down = true;
			}
			else if(row == n-1){
				down = false;
			}
			row += down? 1: -1;
		}
		for(int i =1; i<arr.length; i++)
			arr[0].append(arr[i]);
		
		return arr[0].toString();
	}
}
