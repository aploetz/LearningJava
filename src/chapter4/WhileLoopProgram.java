package chapter4;

import java.util.Scanner;

public class WhileLoopProgram {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		Boolean exit = false;
		
		// Keep running this loop as long as exit is equal to false.
		// Or rather, while exit is NOT equal to true.
		while (!exit) {
			System.out.println("Type \"exit\" to quit.");
			
			// read input
			String input = inputScanner.nextLine();
			
			// check if the input string is equal to the word "exit" (lowercase)
			if (input.equals("exit")) {
				// set exit to true
				exit = true;
			}
		}
		
		// close the input scanner
		inputScanner.close();
		System.out.println("End of program.");
	}

}