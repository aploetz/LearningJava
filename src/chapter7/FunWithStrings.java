package chapter7;

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

		String name = "  Robert California  ";
		// String name = "  rob California  ";
		// String name = "  Rob California  ";
		String nameStripLeading = name.stripLeading();
		String nameStripTrailing = name.stripTrailing();
		String nameTrimmed = name.trim();
		
		int spacePos = nameTrimmed.indexOf(' ');
		String firstName = nameTrimmed.substring(0, spacePos).toUpperCase();
		String lastName = nameTrimmed.substring(spacePos + 1);
		
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
		if (firstName.equals("ROBERT")) {
			System.out.println("Your name is Robert!");
		} else if (firstName.startsWith("ROB")) {
			System.out.println("Your name still starts with Rob!");
	    } else {
			System.out.println("Your name is not Robert!");
		}
	}
}
