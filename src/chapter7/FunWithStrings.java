package chapter7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FunWithStrings {

	public static void main(String[] args) {
		String alphabet = "a";
		alphabet = alphabet + "b";
		alphabet = alphabet + "c";
		alphabet = alphabet + "d";
		alphabet = alphabet + "e";
		
		StringBuilder alphabetBuilder = new StringBuilder("a");
		alphabetBuilder.append('b');
		alphabetBuilder.append('c');
		alphabetBuilder.append("defg");

		// String name = "  Robert California  ";
		// String name = "  rob California  ";
		// String name = "  Rob California  ";
		// String name = "  Bob California  ";
		String name = "  bob California  ";
		
		String nameStripLeading = name.stripLeading();
		String nameStripTrailing = name.stripTrailing();
		String nameTrimmed = name.trim();
		
		int spacePos = nameTrimmed.indexOf(' ');
		String firstName = nameTrimmed.substring(0, spacePos);
		String lastName = nameTrimmed.substring(spacePos + 1);
		String phoneNumber = "111-867-5309";
		
		// Regex pattern and matcher objects
		Pattern namePattern = Pattern.compile("[bBrR]ob");
		Matcher nameMatcher = namePattern.matcher(firstName);
		Pattern phonePattern = Pattern.compile("[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}");
		Matcher phoneMatcher = phonePattern.matcher(phoneNumber);
		
		System.out.println(alphabet);
		System.out.println(alphabetBuilder.toString());
		
		System.out.println("name -> |" + name + "|");
		System.out.println("stripLeading -> |" + nameStripLeading + "|");
		System.out.println("stripTrailing -> |" + nameStripTrailing + "|");
		System.out.println("trim -> |" + nameTrimmed + "|");
		
		System.out.println("spacePos == " + spacePos);
		System.out.println("firstName -> " + firstName);
		System.out.println("lastName -> " + lastName);
		
		// if (firstName == "Robert") {
		if (firstName.toUpperCase().equals("ROBERT")) {
			System.out.println("Your name is Robert!");
		// } else if (firstName.toUpperCase().startsWith("ROB")) {
		} else if (nameMatcher.find()) {
		//	System.out.println("Your name still starts with Rob!");
			System.out.println("Your name still starts with Bob or Rob!");
	    } else {
			System.out.println("Your name is not Robert!");
		}
		
		if (phoneMatcher.find()) {
			System.out.printf("%s is a valid phone number!\n", phoneNumber);
		} else {
			System.out.printf("%s is NOT a valid phone number!\n", phoneNumber);
		}
	}
}
