package main;

public class partTimeEmployee extends Employee {
	
	private int hoursWork;
	private double hourlyRate;
	
	public partTimeEmployee(String name, int id, int hoursWork, double hourlyRate) {
		super(name, id);
		this.hoursWork = hoursWork;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hoursWork * hourlyRate;
	}
	
	

}
