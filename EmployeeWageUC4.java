import java.util.Random;

public class EmployeeWageUC4 
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