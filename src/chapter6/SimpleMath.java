package chapter6;

public class SimpleMath {

	public static void main(String[] args) {
		int x = 13;
		int y = 3;
		
		int addition = x + y;
		int subtraction = x - y;
		int multiplication = x * y;
		int power = (int) Math.pow(x, y);
		int division = x / y;
		int modulo = x % y;
		
		System.out.printf("%d + %d == %d\n", x, y, addition);
		System.out.printf("%d - %d == %d\n", x, y, subtraction);
		System.out.printf("%d x %d == %d\n", x, y, multiplication);
		System.out.printf("%d ^ %d == %d\n", x, y, power);
		System.out.printf("%d " + (char)247 + " %d == %d\n", x, y, division);
		System.out.printf("%d mod %d == %d\n", x, y, modulo);
		System.out.printf("Is %d even? %B\n", x, isEven(x));
		System.out.printf("Is %d even? %B\n", subtraction, isEven(subtraction));

		double a = 4.1;
		double b = 9.7;
		
		System.out.printf("%f - %f == %f\n",a,b,a-b);
		
		System.out.println(.1 + .2);
	}

	private static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		
		return false;
	}
}
