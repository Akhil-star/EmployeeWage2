package com.employeewage2;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilder implements EmpWageInterface{

	static final int IS_FULLTIME = 1;
	static final int IS_PARTTIME = 2;

	private ArrayList<CompanyEmpWage> arrayList = new ArrayList<CompanyEmpWage>();

	public CompanyEmpWage createObject(String name, int totaldays, int totalhours, int perhourwage) {

		CompanyEmpWage obj = new CompanyEmpWage(name, totaldays, totalhours, perhourwage);
		return obj;
	}

	public void calculateWage(CompanyEmpWage obj) {
		int work_hours = 0;
		int total_hours = 0, total_days = 0;

		while (total_days < obj.getTotalWorkingDays() && total_hours <= obj.getTotalWorkingHours()) {
			int checkEmp = (int) (Math.random() * 10) % 3;
			switch (checkEmp) {
			case IS_FULLTIME:
				work_hours = 8;
				break;
			case IS_PARTTIME:
				work_hours = 4;
				break;
			default:
				work_hours = 0;
			}

			total_hours += work_hours;
			total_days++;

			System.out.println("Current Day Hours: " + work_hours + "   Total hours: " + total_hours);
		}

		obj.setTotalWages(total_hours * obj.getPerHourWage());
		System.out.println("The total monthly wages of " + obj.getCompanyName() + " are " + obj.getTotalWages());
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int choice = 1;

		while (choice != 0) {

			EmpWageBuilder ewc = new EmpWageBuilder();
			System.out.println("Enter the company's name:");
			String name = sc.next();
			System.out.println("Enter the total number of working days:");
			int t_days = sc.nextInt();
			System.out.println("Enter the total number of working hours:");
			int t_hrs = sc.nextInt();
			System.out.println("Enter the wage per hour:");
			int ph_wage = sc.nextInt();
			CompanyEmpWage obj2 = ewc.createObject(name, t_days, t_hrs, ph_wage);
			ewc.calculateWage(obj2);
			ewc.arrayList.add(obj2);

		}
		sc.close();
		return;
	}
}
