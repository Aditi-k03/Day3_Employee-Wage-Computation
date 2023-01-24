//UC2 Problem

import java.util.Random;

public class EmployeeWageUC2 
{
    public static void main(String[] args) 
	{
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
		
        int wagePerHour = 20;
        int fullDayHour = 8;
        int fullDayWage = wagePerHour * fullDayHour;
        int E = random.nextInt(2);
		
        if (E == 0) 
		{
            System.out.println("Employee is absent");
        } 
		else 
		{
            System.out.println("Employee is present than daily wage are:-" + fullDayWage);
        }

    }
}