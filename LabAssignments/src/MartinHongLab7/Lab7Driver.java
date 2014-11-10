package MartinHongLab7;

public class Lab7Driver {

	public static void main(String[] args) {
		System.out.println("Lab7 Martin Hong");

		Lab7MethodClass lab7MethodClass = new Lab7MethodClass();

		// flower exception
		try {
			lab7MethodClass.flowerMethod();

		} catch (FlowerException e) {
			System.err.println(e);
		}

		System.out.println();

		// rose exception
		try {
			lab7MethodClass.roseMethod();
		} catch (RoseException e) {
			System.err.println(e);
		}

		System.out.println();

		// tulip exception
		try {
			lab7MethodClass.tulipMethod();
		} catch (TulipException e) {
			System.err.println(e);
		}

		
	}

}
