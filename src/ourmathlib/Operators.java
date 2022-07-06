package ourmathlib;

public class Operators {

	// addition
	public static int add(int x, int y) {
		return x + y;
	}
	
	// make negative
	private static int negative(int x) {
		return multiply(x,-1);
	}
	
	// subtract
	public static int subtract(int x, int y) {
		int negativeY = negative(y);
		int returnVal = add(x,negativeY);
		
		return returnVal;
	}
	
	// multiply
	public static int multiply(int x, int y) {
		int returnVal = 0;
		Boolean yIsPositive = false;

		if (x == 0 || y == 0 ) {
			// if either x or y is zero, then short-circuit the rest of the method and just return zero 
			return 0;
		}
		
		if (y > 0) {
			yIsPositive = true;
		}

		if (yIsPositive) {
			for (int counter = 0; counter < y; counter++) {
				returnVal += x;
			}
		} else {
			// y is negative
			for (int counter = 0; counter > y; counter--) {
				returnVal -= x;
			}			
		}
		
		return returnVal;
	}
	
	// divide x by y
	public static int divide(int x, int y) {
		if (x < y) {
			return 0;
		}
		
		int total = 0;
		int counter = 0;
		
		while (total + y <= x) {
			total = add(total,y);
			counter++;
		}
		
		return counter;
	}
	
	// modulus (division, but return the remainder)
	// modulus is ALWAYS positive!
	public static int modulus(int x, int y) {
		int total = 0;
		
		while (total + y <= x) {
			total = add(total,y);
		}
		
		int remainder = subtract(x,total);
		
		return remainder;
	}
	
}
