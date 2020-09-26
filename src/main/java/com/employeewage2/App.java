package com.employeewage2;

/**
 * Hello world!
 *
 */
public class App 
{	
	public static final int IS_FULL_TIME=2;
	public static final int IS_PART_TIME=1;
	public static final int EMP_RATE_HOUR=20;
	public static final int NUM_DAYS=20;
	public static final int MAX_HRS=100;
	
    public static void main( String[] args )
    {
        	
    	int empHrs=0;
    	int totalHrs=0;
    	int totalWage=0;
    	int totalWorkingDays=0;
    	
    	while(totalHrs<=MAX_HRS && totalWorkingDays<NUM_DAYS) {
    		totalWorkingDays++;
    	int empCheck =(int) Math.floor(Math.random() *10)%3;
    	switch(empCheck) {
        case IS_FULL_TIME:
    		empHrs=8;
    		break;
        case IS_PART_TIME:
    		empHrs=4;
    		break;
    	default :
    		empHrs=0;
    		break;
    }
    	totalHrs += empHrs;
    	System.out.println("Days: " +totalWorkingDays+ " Emp hr:" +empHrs);
    } 
    	totalWage=totalHrs*EMP_RATE_HOUR;
	    System.out.println("Total Emp Wage: " +totalWage);

}
}
