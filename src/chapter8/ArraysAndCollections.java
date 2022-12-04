package chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ArraysAndCollections {

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
		
		// array to use with sets, lists, and maps
		String [] firstNames = {"Coriene", "Khadiya", "Avery", "Emily", "Victoria", "Emily"};
		printArray(firstNames);
		
		// sets
		System.out.println();
		
		// Set<String> nameSet = new HashSet<>();
		// Set<String> nameSet = new LinkedHashSet<>();
		Set<String> nameSet = new TreeSet<>();
		Collections.addAll(nameSet, firstNames);
		
		nameSet.add("Aaron");
		printSet(nameSet);
		
		System.out.println();
		
		nameSet.remove("Aaron");
		printSet(nameSet);
		
		// lists
		System.out.println();

		//   ArrayList
		List<String> nameList = new ArrayList<>();
		Collections.addAll(nameList, firstNames);

		nameList.add("Aaron");
		
		printList(nameList);
		
		// maps
		System.out.println();
		
		Map<String,String> stateCapitalsMap = new HashMap<>();
		
		stateCapitalsMap.put("Alaska", "Juneau");
		stateCapitalsMap.put("Wisconsin", "Madison");
		stateCapitalsMap.put("Minnesota", "St. Paul");
		stateCapitalsMap.put("Illinois", "Springfield");
		stateCapitalsMap.put("Michigan", "Lansing");
		stateCapitalsMap.put("Indiana", "Indianapolis");
		stateCapitalsMap.put("North Dakota","Bismarck");
		stateCapitalsMap.put("Nebraska", "Lincoln");
		stateCapitalsMap.put("South Dakota", "Pierre");
		stateCapitalsMap.put("Iowa", "Des Moines");
		
		String wiCapital = stateCapitalsMap.get("Wisconsin");
		System.out.printf("The capital of Wisconsin is %s \n", wiCapital);
		
		System.out.println();
		
		printMap(stateCapitalsMap);
	}

	private static void printMap(Map<String,String> map) {
		System.out.println("The contents of the map are:");
		
		for (String key : map.keySet()) {
			String value = map.get(key);
			System.out.printf("%s : %s \n",key,value);
		}
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
			System.out.printf("%s ", arrayIncoming[intCounter]);
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
