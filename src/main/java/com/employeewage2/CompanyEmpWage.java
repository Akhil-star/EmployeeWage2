package com.employeewage2;

public class CompanyEmpWage {
	private String companyName;
	private int totalWorkingDays;
	private int totalWorkingHours;
	private int perHourWage;
	private int totalWages = 0;
	
	public 	CompanyEmpWage(String companyName, int totalWorkingDays, int totalWorkingHours, int perHourWage) {
		
		this.companyName = companyName;
		this.totalWorkingDays = totalWorkingDays;
		this.totalWorkingHours = totalWorkingHours;
		this.perHourWage = perHourWage;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}

	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}

	public int getTotalWorkingHours() {
		return totalWorkingHours;
	}

	public void setTotalWorkingHours(int totalWorkingHours) {
		this.totalWorkingHours = totalWorkingHours;
	}

	public int getPerHourWage() {
		return perHourWage;
	}

	public void setPerHourWage(int perHourWage) {
		this.perHourWage = perHourWage;
	}

	public int getTotalWages() {
		return totalWages;
	}

	public void setTotalWages(int totalWages) {
		this.totalWages = totalWages;
	}

}