package ourmathlib;

public class Operators {

	// addition
	public static int add(int intX,int intY) {
		return intX + intY;
	}
	
	// multiply
	public static int multiply(int intX, int intY) {
		int returnVal = 0;
		boolean yIsPositive = false;

		if (intX == 0 || intY == 0 ) {
			// if either x or y is zero, then short-circuit
			// the rest of the method and just return zero 
			return 0;
		}
		
		if (intX == 1) {
			// if x == 1, then short-circuit the method
			// returning y
			return intY;
		}
		
		if (intY == 1) {
			// if y == 1, then short-circuit the method
			// returning x
			return intX;
		}
		
		if (intY > 0) {
			yIsPositive = true;
		}

		if (yIsPositive) {
			for (int counter = 0; counter < intY; counter++) {
				returnVal += intX;
			}
		} else {
			// y is negative
			for (int counter = 0; counter > intY; counter--) {
				returnVal -= intX;
			}			
		}
		
		return returnVal;
	}

	// make negative
	private static int negative(int intX) {
		return multiply(intX,-1);
	}

	// subtract
	public static int subtract(int intX, int intY) {
		int negativeY = negative(intY);
		int returnVal = add(intX,negativeY);
		
		return returnVal;
	}

	// divide x by y
	public static int divide(int intX, int intY) {
		if (intY == 0) {
			// avoiding a divide by zero error
			return 0;
		}

		if (intX < intY) {
			return 0;
		}
		
		int total = 0;
		int counter = 0;
		
		while (total + intY <= intX) {
			total = add(total,intY);
			counter++;
		}
		
		return counter;
	}
	
	// modulus (division, but return the remainder)
	// modulus is ALWAYS positive!
	public static int modulus(int intX, int intY) {
		int total = 0;
		
		if (intY == 0) {
			// avoiding a divide by zero error
			return 0;
		}
		
		while (total + intY <= intX) {
			total = add(total,intY);
		}
		
		int remainder = subtract(intX,total);
		
		return remainder;
	}
	
	public static int exponent(int intX, int intY) {
		int total = 0;
		
		if (intY == 0) {
			// any number taken to the power of zero == 1
			return 1;
		} else if (intY == 1) {
			// any number taken to the power of one == itself
			return intX;
		} else {
			for (int counter = 0; counter < intY; counter++) {
				if (total > 0) {
					total = total * intX;
				} else {
					total = intX;
				}
			}
			
			return total;
		}
	}
}
