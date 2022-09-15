package chapter6;

import ourmathlib.Operators;

public class SimpleMathMethods {

	public static void main(String[] args) {
		int x = 13;
		int y = 3;
		
		int addition = Operators.add(x,y);
		int subtraction = Operators.subtract(x, y);
		int multiply = Operators.multiply(x, y);
		int divide = Operators.divide(x, y);
		int modulus = Operators.modulus(x, y);
		int exponent = Operators.exponent(x,y);

		
		System.out.printf("%d + %d == %d\n", x, y, addition);
		System.out.printf("%d - %d == %d\n", x, y, subtraction);
		System.out.printf("%d x %d == %d\n", x, y, multiply);
		System.out.printf("%d / %d == %d\n", x, y, divide);
		System.out.printf("%d %% %d == %d\n", x, y, modulus);
		System.out.printf("%d ^ %d == %d\n", x, y, exponent);

	}

}
