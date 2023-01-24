//UC1 Problem

import java.util.Random;

public class EmployeeWageUC1 
{
    public static void main(String[] args) 
	{
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int E = random.nextInt(2);
		
        if (E == 0) 
		{
            System.out.println("Employee is absent");
        } 
		else 
		{
            System.out.println("Emplyee is present");
        }

    }
}

