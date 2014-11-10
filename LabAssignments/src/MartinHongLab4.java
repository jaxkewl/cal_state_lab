public class MartinHongLab4 {

	// this method needs to accept two integers
	private static int exponent(int first, int second) {

		// raise first ^ second
		double var = Math.pow((double) first, (double) second);

		return (int) var;
	}

	// this method needs to accept an array of doubles
	private static double exponent(double[] doubleArray) {

		// raise first ^ second
		return Math.pow(doubleArray[0], doubleArray[1]);
	}

	public static void main(String[] arg) {

		/*
		 * Write a Java Application that has two overloaded methods to calculate
		 * and return the exponentiation of the first parameter, to the second
		 * parameter.
		 * 
		 * One method accepts two integers and returns an integer, the other
		 * method accepts an array of two doubles and and returns a double.
		 */

		int methodOne = MartinHongLab4.exponent(2, 3);
		System.out.println("Method Exponent takes int and returns int. 2^3 = "
				+ methodOne);

		double[] doubleArray = { 5.1, 3.2 };
		double methodTwo = MartinHongLab4.exponent(doubleArray);
		System.out.printf(
				"Method Exponent takes an array of double and returns double. "
						+ doubleArray[0] + "^" + doubleArray[1] + " = %.2f",
				methodTwo);

	}
}
