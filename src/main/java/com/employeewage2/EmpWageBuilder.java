package com.employeewage2;

/**
 * Hello world!
 *
 */
public class EmpWageBuilder {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;

	private final String compName;
	private final int empRateHr;
	private final int noOfWorkingDays;
	private final int maxHrsMonth;
	private int totalWage;

	public static void main(String[] args) {
		EmpWageBuilder abc = new EmpWageBuilder("abc", 20, 20, 10);
		EmpWageBuilder xyz = new EmpWageBuilder("xyz", 5, 10, 10);
		EmpWageBuilder cg = new EmpWageBuilder("cg", 10, 6, 20);
		abc.computeEmpWage();
		System.out.println(abc);
		xyz.computeEmpWage();
		System.out.println(xyz);
		cg.computeEmpWage();
		System.out.println(cg);
	}

	public EmpWageBuilder(String compName, int empRateHr, int noOfWorkingDays, int maxHrsMonth) {
		this.compName = compName;
		this.empRateHr = empRateHr;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrsMonth = maxHrsMonth;

	}

	public void computeEmpWage() {
		int empHrs = 0;
		int totalHrs = 0;
		int totalWorkingDays = 0;

		while (totalHrs <= maxHrsMonth && totalWorkingDays < noOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalHrs += empHrs;
			System.out.println("Days: " + totalWorkingDays + " Emp hr:" + empHrs);
		}
		totalWage = totalHrs * empRateHr;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: " + compName + " is: " + totalWage;
	}
}
