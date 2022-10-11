package chapter6;

import java.math.BigDecimal;

public class SimpleMath {

	public static void main(String[] args) {
		int intX = 13;
		int intY = 3;
		
		int addition = intX + intY;
		int subtraction = intX - intY;
		int multiplication = intX * intY;
		int power = (int) Math.pow(intX, intY);
		int division = intX / intY;
		int modulo = intX % intY;
		
		System.out.printf("%d + %d == %d\n", intX, intY, addition);
		System.out.printf("%d - %d == %d\n", intX, intY, subtraction);
		System.out.printf("%d x %d == %d\n", intX, intY, multiplication);
		System.out.printf("%d ^ %d == %d\n", intX, intY, power);
		System.out.printf("%d " + (char)247 + " %d == %d\n", intX, intY, division);
		System.out.printf("%d mod %d == %d\n", intX, intY, modulo);
		System.out.printf("Is %d even? %B\n", intX, isEven(intX));
		System.out.printf("Is %d even? %B\n", subtraction, isEven(subtraction));

		double dblA = 4.1;
		double dblB = 9.71;
		double dblSubtraction = dblA - dblB;
		
		BigDecimal decC = new BigDecimal(.1);
		BigDecimal decD = new BigDecimal(.2);
		
		// System.out.printf("%f - %f == %f\n", dblA, dblB, dblSubtraction);
		// System.out.printf("%3.3f - %3.3f == %3.3f\n", dblA, dblB, dblSubtraction);
		System.out.printf("%3.1f - %3.1f == %3.1f\n", dblA, dblB, dblSubtraction);
		
		System.out.println(.1 + .2);
		
		System.out.printf("%1.1f + %1.1f == %1.1f\n", decC, decD, decC.add(decD));
	}

	private static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		
		return false;
	}
}
