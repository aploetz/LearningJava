package chapter5;

import ourmathlib.Operators;

public class SimpleMath {

	public static void main(String[] args) {
		int x = 5;
		int y = -3;
		
		int addition = Operators.add(x,y);
		int subtraction = Operators.subtract(x, y);
		int multiply = Operators.multiply(x, y);
		
		System.out.printf("%d + %d == %d\n", x, y, addition);
		System.out.printf("%d - %d == %d\n", x, y, subtraction);
		System.out.printf("%d x %d == %d\n", x, y, multiply);
	}

}
