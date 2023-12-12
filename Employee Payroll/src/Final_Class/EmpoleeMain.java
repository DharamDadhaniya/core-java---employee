package Final_Class;

import java.util.Scanner;

import main.Employee;
import main.FullTimeEmployee;
import main.PayrollSystem;
import main.partTimeEmployee;

public class EmpoleeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PayrollSystem payrollSystem = new PayrollSystem();
		String ch;
		do {

		System.out.println("Choose 1 Option...");
		System.out.println("**********************************");
		System.out.println("1) Add Full Time Employee");
		System.out.println("2) Add Part Time Employee");
		System.out.println("3) Delet Employee");
		System.out.println("4) Show all Employee");

		System.out.println("Enter the choose number...");
		int n = sc.nextInt();

		switch (n) {
		case 1: {
			System.out.println("Enter the name...");
			String name = sc.next();
			System.out.println("Enter the ID...");
			int id = sc.nextInt();
			System.out.println("Enter the Monthly Salary...");
			int salary = sc.nextInt();

			FullTimeEmployee emp = new FullTimeEmployee(name, id, salary);
			payrollSystem.addEmployee(emp);
			System.out.println("------------------------------------");
			System.out.println("Successfully Add this Employee...");
			break;
		}
		case 2: {
			System.out.println("Enter the name...");
			String name = sc.next();
			System.out.println("Enter the ID...");
			int id = sc.nextInt();
			System.out.println("Enter the Working Hours...");
			int wh = sc.nextInt();
			System.out.println("Enter the Hours Rate...");
			int hr = sc.nextInt();

			partTimeEmployee emp = new partTimeEmployee(name, id, wh, hr);
			payrollSystem.addEmployee(emp);
			System.out.println("------------------------------------");
			System.out.println("Successfully Add this Employee...");
			break;
		}

		case 3: {
			System.out.println("Remove Employee");
			int r = sc.nextInt();

			payrollSystem.removeEmployee(r);
			System.out.println("------------------------------------");
			System.out.println("Successfully Remove this Employee...");
			break;
		}

		case 4: {
			payrollSystem.displayEmployees();
			break;
		}

		}
		System.out.println("*****************************************");
		System.out.println("Any Choose Options...  (Yes / No)");
		ch = sc.next();
		}
		while(ch.equalsIgnoreCase("yes"));
		System.out.println("======================");
		System.out.println("Thank you...");
	}

}
