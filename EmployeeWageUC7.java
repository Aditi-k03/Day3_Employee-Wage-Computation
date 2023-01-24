import java.util.Random;

public class EmployeeWageUC7
{
    public static final int fullDayHour = 1;
    public static final int partTimeHour = 2;
    public static final int isabsent = 0;
    public static final int wagePerHour = 20;
    public static final int totalWorkingDay = 20;

    static int empHrs;
    static int totalEarnings = 0;
    static int dailyWage;
    static int empDays = 0;

    public static void main(String[] args) 
	{
        getDailyWage();
        getSalary();
    }

    public static void getWage()
	{
        dailyWage = empHrs * wagePerHour;
        totalEarnings = totalEarnings + dailyWage;
        System.out.println("Earning on Day " + empDays + " is: " + dailyWage );
    }
	
    public static void getDailyWage()
	{
        for (int i = 0; i < totalWorkingDay; i++) 
		{
            int random = (int) (Math.random() * 10) % 3;
            empDays++;
            switch (random) {
                case 1:        
                    empHrs = 8;
                    getWage();
                    break;
                case 2:         
                    empHrs = 4;
                    getWage();
                    break;
                default:            
                    empHrs = 0;
                    getWage();
                    break;
            }
        }
    }
	
    public static void getSalary()
	{
        System.out.println("Employee total Earned in a month:- " + totalEarnings);
    }
}