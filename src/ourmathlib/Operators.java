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
	
	// divide
	
	// modulus (division, but return the remainder)
	
}
