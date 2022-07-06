package chapter4;

import java.util.Scanner;

public class InputProgram {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("What is your name? ");
		String yourName = inputScanner.nextLine();
		inputScanner.close();
		
		System.out.printf("Hello computer, my name is %s\n", yourName);
	}

}
