package MartinHongLab7;

public class FlowerException extends Exception {

	// empty constructor exception
	public FlowerException() {
		super();
	}

	// string constructor
	public FlowerException(String exc) {
		super(exc);
	}

	// throwable exception
	public FlowerException(Throwable cause) {
		super(cause);
	}

	// throwable exception with message
	public FlowerException(String exc, Throwable cause) {
		super(exc, cause);
	}
}
