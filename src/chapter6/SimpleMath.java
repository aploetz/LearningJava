package chapter6;

public class SimpleMath {

	public static void main(String[] args) {
		int x = 13;
		int y = 3;
		
		int addition = x + y;
		int subtraction = x - y;
		int multiply = x * y;
		int divide = x / y;
		int modulus = x % y;
		int exponent = (int) Math.pow(x, y);
		
		System.out.printf("%d + %d == %d\n", x, y, addition);
		System.out.printf("%d - %d == %d\n", x, y, subtraction);
		System.out.printf("%d x %d == %d\n", x, y, multiply);
		System.out.printf("%d / %d == %d\n", x, y, divide);
		System.out.printf("%d %% %d == %d\n", x, y, modulus);
		System.out.printf("%d ^ %d == %d\n", x, y, exponent);

	}

}
