package chapter5;

import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String status;

		System.out.print("Enter a numeric status: ");
		int input = inputScanner.nextInt();
		inputScanner.close();

/*		switch(input) {
			case 2:
				status = "PAYMENT RECEIVED";
		break;
			case 3:
				status = "INVENTORY PICKED";
		break;
			case 4:
				status = "SHIPPED";
		break;
			case 5:
				status = "DELIVERED";
		break;
			default:
				status = "PENDING";
		}*/

		status = decodeStatus(input);
		
		System.out.printf("Order code of %d equals a status of %s \n", input, status);

	}

	private static String decodeStatus(int statusNum) {
		
		String returnVal;
		
		switch(statusNum) {
			case 2:
				returnVal = "PAYMENT RECEIVED";
				break;
			case 3:
				returnVal = "INVENTORY PICKED";
				break;
			case 4:
				returnVal = "SHIPPED";
				break;
			case 5:
				returnVal = "DELIVERED";
				break;
			default:
				returnVal = "PENDING";
		}
		
		return returnVal;
	}
}
