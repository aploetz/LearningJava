package utilities;

public class CharacterDecoder {

	public static void main(String[] args) {
		// used to build Appendix A
		System.out.print("Dec\tOct\tHex\tUTF\tASCII\tBinary");
		System.out.print("\t\t");
		System.out.println("Dec\tOct\tHex\tUTF\tASCII\tBinary");
		
		for (int intCounter = 0; intCounter < 128; intCounter++) {
			printCharEncodingLine(intCounter);
			System.out.print("\t\t");
			printCharEncodingLine(intCounter + 128);			
			// jump to next line
			System.out.println();
		}
		
		printCharEncodingLine(7);
	}

	private static void printCharEncodingLine(int asciiNum) {
		// print numbers in decimal, octal and hexidecimal
		System.out.print(asciiNum + "\t");
		System.out.print(Integer.toOctalString(asciiNum) + "\t");
		System.out.print(Integer.toHexString(asciiNum).toUpperCase() + "\t");
		
		// get UTF16 representation
		Character utf16 = (char)asciiNum;
		System.out.print(utf16 + "\t");
		System.out.print(Integer.toBinaryString(asciiNum));
	}
}
