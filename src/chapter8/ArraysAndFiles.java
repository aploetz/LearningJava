package chapter8;

public class ArraysAndFiles {

	public static void main(String[] args) {
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