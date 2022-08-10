package APRIL2022;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class PrintScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your word:");
		String word =scanner.nextLine();
		       char []newWord=word.toCharArray();
	     for(int i=0;i<newWord.length;i++) {
			System.out.println(newWord[i]);
		}
				
			
	}
}

