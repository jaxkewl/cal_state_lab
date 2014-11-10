package MartinHongLab6;

public class SalaryEmployee implements Employee {

	private String name;
	private double baseWeeklyRate;
	
	public SalaryEmployee(String name, double baseWeeklyRate) {
		setName(name);
		setBaseWeeklyRate(baseWeeklyRate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	public double getBaseWeeklyRate() {
		return baseWeeklyRate;
	}

	public void setBaseWeeklyRate(double baseWeeklyRate) {
		this.baseWeeklyRate = baseWeeklyRate;
	}

	@Override
	public void calculateWeeklyPay() {
		System.out.println("Calculating pay for " + getName());
		setBaseWeeklyRate(getBaseWeeklyRate());
	}

	@Override
	public void displayTotalTime() {
		System.out.println("Total Time: 1 week");
	}

	@Override
	public void displayWeeklyPay() {
		System.out.println(getBaseWeeklyRate());

	}

}
