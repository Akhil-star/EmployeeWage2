package com.employeewage2;

public class CompanyEmpWage {
	private String companyName;
	private int totalWorkingDays;
	private int totalWorkingHours;
	private int perHourWage;
	private int totalWages = 0;
	private int dailyWage=0;

	
	public CompanyEmpWage(String company_name, int total_working_days, int total_working_hours, int perhour_wage) {

		this.companyName = company_name;
		this.totalWorkingDays = total_working_days;
		this.totalWorkingHours = total_working_hours;
		this.perHourWage = perhour_wage;
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
	public int getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}


}
