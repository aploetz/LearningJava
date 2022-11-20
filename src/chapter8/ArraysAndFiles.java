package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysAndFiles {

	public static void main(String[] args) {
		// arrays
		
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

		System.out.printf("The alphabet array has a size of %d\n", alphabet.length);
		System.out.println(alphabet[0]);
		System.out.println(alphabet[10]);
		System.out.println(alphabet[25]);
		
		printArray(alphabet);

		char[] alphabetUpper = upperCaseCharArray(alphabet);

		printArray(alphabetUpper);
		
		// files
		
		// writer
		System.out.println();
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("alphabetUpper.txt"));
			writer.write(alphabetUpper);
			writer.close();
			
			System.out.println("alphabetUpper has been written to alphabetUpper.txt!");
		} catch (IOException exw) {
			System.out.println(exw.toString());
		}

		// reader
		System.out.println();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("data/astronauts.csv"));
			String astronautLine = reader.readLine();

			int counter = 0;
			final int counterMax = 6;
			
			while (astronautLine != null && counter < counterMax) {
				//String[] astronautColumns = astronautLine.split(",");
				String[] astronautColumns = astronautLine.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
				
				String name = astronautColumns[0];
				String dateOfBirth = astronautColumns[4];
				String birthplace = astronautColumns[5];
				String spaceflightHours = astronautColumns[9];

				System.out.printf("%s - %s - %s - %s\n", name, dateOfBirth, birthplace, spaceflightHours);
				
				// read next line
				astronautLine = reader.readLine();
				counter++;
			}
			
			reader.close();
		} catch (IOException exr) {
			System.out.println(exr.toString());
		}

		// array to use with sets, lists, and maps
		String [] firstNames = {"Coriene", "Khadiya", "Avery", "Emily", "Victoria", "Emily"};
		printArray(firstNames);
		
		// sets
		System.out.println();
		
		Set<String> nameSet = new HashSet<>();
		Collections.addAll(nameSet, firstNames);
		
		printSet(nameSet);
		
		// lists
		System.out.println();

		List<String> nameList = new ArrayList<>();
		Collections.addAll(nameList, firstNames);

		printList(nameList);
		
		// maps
		System.out.println();

		
	}

	private static void printList(List<String> list) {
		System.out.println("The contents of the list are:");
		
		for (String item : list) {
			System.out.println(item);
		}
	}

	private static void printSet(Set<String> set) {
		System.out.println("The contents of the set are:");
		
		for (String item : set) {
			System.out.println(item);
		}
	}

	private static void printArray(String[] arrayIncoming) {
		for (int intCounter = 0; intCounter < arrayIncoming.length; intCounter++ ) {
			System.out.printf("%s", arrayIncoming[intCounter]);
		}
		
		System.out.println();
	}

	private static void printArray(char[] arrayIncoming) {
		for (int intCounter = 0; intCounter < arrayIncoming.length; intCounter++ ) {
			System.out.printf("%c", arrayIncoming[intCounter]);
		}
		
		System.out.println();
	}

	private static char[] upperCaseCharArray(char[] arrayIncoming) {
		char[] arrayUppercase = new char[arrayIncoming.length];

		for (int intCounter = 0; intCounter < arrayIncoming.length; intCounter++ ) {
			char upper = Character.toUpperCase(arrayIncoming[intCounter]);
			arrayUppercase[intCounter] = upper;
		}

		return arrayUppercase;
	}
}
