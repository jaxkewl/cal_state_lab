package MartinHongLab6;

public class Lab6Driver {

	public static void main(String[] args) {
		//create objects using a reference to the interface
		Employee commissionEmployee = new CommissionEmployee(
				"Martin", 0.05, 4000);
		Employee salaryEmployee = new SalaryEmployee("John", 5600);

		commissionEmployee.calculateWeeklyPay();
		commissionEmployee.displayTotalTime();
		commissionEmployee.displayWeeklyPay();

		salaryEmployee.calculateWeeklyPay();
		salaryEmployee.displayTotalTime();
		salaryEmployee.displayWeeklyPay();
	}
}
