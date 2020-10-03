package com.employeewage2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilder implements EmpWageInterface {

	static final int IS_FULLTIME = 1;
	static final int IS_PARTTIME = 2;

	private ArrayList<CompanyEmpWage> arrayList = new ArrayList<CompanyEmpWage>();

	public CompanyEmpWage createObject(String name, int totaldays, int totalhours, int perhourwage) {

		CompanyEmpWage obj = new CompanyEmpWage(name, totaldays, totalhours, perhourwage);
		return obj;
	}

	public void calculateWage(CompanyEmpWage obj) {
		int workHours = 0;
		int totalHours = 0, totalDays = 0;
		while (totalDays < obj.getTotalWorkingDays() && totalHours <= obj.getTotalWorkingHours()) {
			int checkEmp = (int) (Math.random() * 10) % 3;
			switch (checkEmp) {
			case IS_FULLTIME:
				workHours = 8;
				break;
			case IS_PARTTIME:
				workHours = 4;
				break;
			default:
				workHours = 0;
			}

			totalHours += workHours;
			totalDays++;

			System.out.println("Current Day Hours: " + workHours + "   Total hours: " + totalHours);
			obj.setDailyWage(workHours * obj.getPerHourWage());
			System.out.println("The Daily wage : " + obj.getDailyWage());
		}
		obj.setTotalWages(totalHours * obj.getPerHourWage());
		System.out.println("The total monthly wages of " + obj.getCompanyName() + " are " + obj.getTotalWages());
	}

	public int getTotalWages(CompanyEmpWage cew) {

		int totalWages = cew.getTotalWages();
		return totalWages;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while (choice != 0) {
			EmpWageBuilder ewc = new EmpWageBuilder();
			System.out.println("Enter the company's name:");
			String name = sc.next();
			System.out.println("Enter the total number of working days:");
			int totalDays = sc.nextInt();
			System.out.println("Enter the total number of working hours:");
			int totalHrs = sc.nextInt();
			System.out.println("Enter the wage per hour:");
			int perHrWage = sc.nextInt();
			CompanyEmpWage obj2 = ewc.createObject(name, totalDays, totalHrs, perHrWage);
			ewc.calculateWage(obj2);
			ewc.arrayList.add(obj2);
			System.out.println("The total wages of " + obj2.getCompanyName() + " are: " + ewc.getTotalWages(obj2));

		}
		sc.close();
		return;
	}
}
