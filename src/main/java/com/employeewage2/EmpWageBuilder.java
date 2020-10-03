package com.employeewage2;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EmpWageBuilder implements EmpWageInterface{

	static final int present_fulltime = 1;
	static final int present_parttime = 2;

	private ArrayList<CompanyEmpWage> arrayList = new ArrayList<CompanyEmpWage>();

	public CompanyEmpWage createObject(String name, int totaldays, int totalhours, int perhourwage) {

		CompanyEmpWage obj = new CompanyEmpWage(name, totaldays, totalhours, perhourwage);
		return obj;
	}

	public void calculateWage(CompanyEmpWage obj) {
		int work_hours = 0;
		int total_hours = 0, total_days = 0;

		while (total_days < obj.getTotal_working_days() && total_hours <= obj.getTotal_working_hours()) {
			int checkEmp = (int) (Math.random() * 10) % 3;
			switch (checkEmp) {
			case present_fulltime:
				work_hours = 8;
				break;
			case present_parttime:
				work_hours = 4;
				break;
			default:
				work_hours = 0;
			}

			total_hours += work_hours;
			total_days++;

			System.out.println("Current Day Hours: " + work_hours + "   Total hours: " + total_hours);
		}

		obj.setTotal_wages(total_hours * obj.getPerhour_wage());
		System.out.println("The total monthly wages of " + obj.getCompany_name() + " are " + obj.getTotal_wages());
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
