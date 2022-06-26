
public class VariableProgram {

	public static void main(String[] args) {
		// define a String for your name here
		// String yourName = "Aaron";
		String yourName = args[0];
		
		// System.out.println("Hello computer, my name is " + yourName);
		System.out.printf("Hello computer, my name is %s\n", yourName);
	}

}
