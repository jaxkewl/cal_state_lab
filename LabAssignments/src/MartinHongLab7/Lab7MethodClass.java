package MartinHongLab7;

public class Lab7MethodClass {

	public void tulipMethod() throws TulipException {
		System.out.println("Calling tulip method");

		throw new TulipException("Tulip exception thrown from tulipMethod");
	}

	public void roseMethod() throws RoseException {
		System.out.println("Calling rose method");
		throw new RoseException("Rose Exception thrown from roseMethod");

	}

	public void flowerMethod() throws FlowerException {
		System.out.println("calling flower method");
		throw new FlowerException("Flower Exception thrown from flowerMethod");
	}


	
	
	
	
	
}
