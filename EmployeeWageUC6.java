import java.util.Random;

public class EmployeeWageUC6 
{
    public static void main(String[] args) 
	{
        int fullDayHour = 1;
        int partTimeHour = 2;
        int isabsent = 0;
        int wagePerHour = 20;
        int totalWorkingDay = 20;

        int empHrs;
        int totalEarnings = 0;
        int dailyWage;
        int empDays = 0;

        for (int i = 0; i < totalWorkingDay; i++) 
		{
            int random = (int) (Math.random() * 10) % 3;
            empDays++;
            switch (random) 
			{
                case 1:        
                    empHrs = 8;
                    dailyWage = empHrs * wagePerHour;
                    totalEarnings = totalEarnings + dailyWage;
                    System.out.println("Earning on Day " + empDays + " is: " + dailyWage + " and Total Earnings:- " + totalEarnings);
                    break;
					
                case 2:         
                    empHrs = 4;
                    dailyWage = empHrs * wagePerHour;
                    totalEarnings = totalEarnings + dailyWage;
                    System.out.println("Earning on Day " + empDays + " is: " + dailyWage + " and Total Earnings:- " + totalEarnings);
                    break;
					
                default:            
                    empHrs = 0;
                    dailyWage = empHrs * wagePerHour;
                    totalEarnings = totalEarnings + dailyWage;
                    System.out.println("Earning on Day " + empDays + " is: " + dailyWage + " and Total Earnings:- " + totalEarnings);
                    break;
            }
        }
        System.out.println("Employee total Earned in a month:- " + totalEarnings);
    }
}