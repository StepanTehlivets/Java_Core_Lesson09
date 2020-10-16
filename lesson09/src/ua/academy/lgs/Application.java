package ua.academy.lgs;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.println("Enter word to perform palindrome check");
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		String noCase = input.toLowerCase();

		if (noCase.length() == 5) {
			if ((noCase.charAt(0) == noCase.charAt(4)) & (noCase.charAt(1) == noCase.charAt(3))) {
				System.out.println("Word " + input + " is palindrome");
			} else {
				System.out.println("Word " + input + " is not palindrome");
			}

		} else {
			System.err.println("Sorry, entered word must contain 5 letters");
		}

	}
}
