package chapter6;

import ourmathlib.Operators;

public class SimpleMathMethods {

	public static void main(String[] args) {

		int intX = 13;
		int intY = 3;
		// intY = -3;
		// intY = 0;
		
		int addition = Operators.add(intX, intY);
		int multiplication = Operators.multiply(intX, intY);
		int subtraction = Operators.subtract(intX, intY);
		int division = Operators.divide(intX, intY);
		//int modulo = Operators.modulus(intX, intY);
		//int power = Operators.exponent(intX, intY);

		
		System.out.printf("%d + %d == %d\n", intX, intY, addition);
		System.out.printf("%d x %d == %d\n", intX, intY, multiplication);
		System.out.printf("%d - %d == %d\n", intX, intY, subtraction);
		System.out.printf("%d / %d == %d\n", intX, intY, division);
		//System.out.printf("%d %% %d == %d\n", intX, intY, modulo);
		//System.out.printf("%d ^ %d == %d\n", intX, intY, power);

	}

}
