package APRIL2022;

import java.util.StringTokenizer;

public class loopoverStringOnly {
	public static String reverseString(String input) {
		String reversed="";
		char[] x = input.toCharArray();
		for(int i=x.length-1;i>=0;i--) {
			reversed +=x[i];
		}
		return reversed;
	}
public static void main(String[] args) {
	String finalString =reverseString("International").toUpperCase();
	System.out.println(finalString);
	
	
}
}
