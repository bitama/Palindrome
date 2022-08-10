package APRIL2022;

import java.util.Stack;

public class ReverseStringUsingStack{
	public static void main(String[] args) {
		reverseString("Programmin");
	}
	private static void reverseString(String input) {
		Stack <Character>stack = new Stack();
		StringBuffer sBuffer = new StringBuffer();
		
		for(int i=0;i<=input.length();i++) {
			Character x =stack.push(input.charAt(i));
			System.out.println(x);
		}
	}

}
