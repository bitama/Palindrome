package APRIL2022;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word to check:\n");
		String word = scanner.nextLine();
		System.out.println(isPalindrome(word));
		

		
	}

	public static boolean isPalindrome(String str) {
		
		if(checkPalindrome(str).equalsIgnoreCase(str)) {
			return true;
		}else {
			return false;
		}
	}
	
	

	public static String checkPalindrome(String input) {
		String reversed="";
		char[] x = input.toCharArray();
		for(int i=x.length-1;i>=0;i--) {
		reversed +=x[i];
	
	}
		return reversed;
		

}
}
