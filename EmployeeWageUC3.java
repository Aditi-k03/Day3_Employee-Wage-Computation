/*import java.util.Random;

public class EmployeeWageUC3 
{
    public static void main(String[] args) 
	{
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
		
        int wagePerHour = 20;
        int fullDayHour = 16;
        int partTimeHour = 8;
        int fullDayWage = wagePerHour * fullDayHour;
        int E = random.nextInt(3);
		
        switch (E) 
		{
            case 0:
					System.out.println("Employee is absent");
					break;
				
            case 1:
					System.out.println("Employee is present at full day than daily wage are:-" + fullDayWage);
					break;
				
            default:
					System.out.println();
					System.out.println("Employee is present at part time than daily wage are:-" + partTimeHour * wagePerHour);
        }
    }
}

*/


/*
import java.util.Random;

public class EmployeeWageUC3 
{
    public static void main(String[] args) 
	{
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();

        int wagePerHour = 20;
		System.out.print("working hours is:- ");
        int fullDayHour = 16;
        int partTimeHour = 8;
        int fullDayWage = wagePerHour * fullDayHour;
        int E = random.nextInt(3);
		
        if (E==16)
		{
            System.out.println("Employee is present at full day than daily wage are:-" + fullDayWage);
        }
        else if (E==8)
		{
                System.out.println("Employee is present at part time than daily wage are:-" + partTimeHour * wagePerHour);
        }
        else 
		{
            System.out.println("Employee is absent");
        }
    }
}
*/

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageUC3 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int perHourSalary = 20;
        System.out.print("working hours:- ");
        int hours = sc.nextInt();
        if (hours==8)
		{
            System.out.println("Employee is present at full day than daily wage are:-" + perHourSalary*hours);
        }
        else if (hours==4){
            //partTime employee
                System.out.println("Employee is present at part time than daily wage are:-" + perHourSalary*hours);
            }
        else {
            System.out.println("Employee is absent");
        }


    }
}