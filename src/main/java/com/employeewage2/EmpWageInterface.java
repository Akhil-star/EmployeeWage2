package com.employeewage2;

public interface EmpWageInterface {
	public CompanyEmpWage createObject(String name, int totaldays, int totalhours, int perhourwage);
	public void calculateWage(CompanyEmpWage obj);
}
