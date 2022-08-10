package APRIL2022;

import java.util.Scanner;

public class WhileAndDowhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Word:");
		String word = scanner.nextLine();
		
		 do{
			System.out.println("Hello");
		}while(word.contains("e"));
		System.out.println("done");
	}

}
