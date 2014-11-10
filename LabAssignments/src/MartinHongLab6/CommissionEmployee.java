package MartinHongLab6;

public class CommissionEmployee implements Employee {

	private String name;
	private double baseRate;
	private double grossSales;
	private double weeklyPay;

	public CommissionEmployee(String name, double rate, double grossSales) {
		setName(name);
		setGrossSales(grossSales);
		setRate(rate);
	}

	public double getWeeklyPay() {
		return weeklyPay;
	}

	public void setWeeklyPay(double weeklyPay) {
		this.weeklyPay = weeklyPay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return baseRate;
	}

	public void setRate(double rate) {
		this.baseRate = rate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	@Override
	public void calculateWeeklyPay() {
		System.out.println("Calculating pay for " + getName());
		setWeeklyPay(getRate() * getGrossSales());
	}

	@Override
	public void displayTotalTime() {
		System.out.println("Total Time: 1 week");
	}

	@Override
	public void displayWeeklyPay() {
		System.out.println(getWeeklyPay());
	}

}
