package LiveAssignments.classThree;
import java.util.Scanner;
public class CustomExceptionEg {
	static void checkSalary(int salary) throws SalaryException
	{
		if(salary<2100)
		{
			throw new SalaryException("you need to work hard");
		}
		else if(salary>2100 && salary<5000)
		{
			System.out.println("your salary is somehow good");
		}
		else if(salary>5000)
		{
			System.out.println("salary is very good");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter salary");
			int a = sc.nextInt();
			checkSalary(a);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		}
	}

}

class SalaryException extends Exception
{
	SalaryException(String s){
		super(s);
	}
}