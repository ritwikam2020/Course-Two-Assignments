package LiveAssignments.classThree;
class Calculation
{
	synchronized public void  Factorial(int num)
	{
		int result = 1;
		for(int i=1;i<=num;i++)
		{
			result *= i;
		}
		System.out.println("thread name "+Thread.currentThread().getName()+" Factorial result = "+result);
	}
	synchronized public void  Addition(int num1, int num2)
	{
		int result = 0;
		result = num1+num2;
		System.out.println("thread name "+Thread.currentThread().getName()+" Addition result = "+result);
	}
}
class Factorial extends Thread
{
	int num1;
	Calculation cal;
	Factorial(Calculation cal,int num)
	{
		this.num1 = num;
		this.cal = cal;
	}
	public void run()
	{
		cal.Factorial(this.num1);
	}
	
}
class Addition extends Thread
{
	int num1;
	int num2;
	Calculation cal ;
	Addition(Calculation cal,int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.cal = cal;
	}
	public void run()
	{
		cal.Addition(this.num1,this.num2);
	}
}
public class SynchronisedThread {
	public static void main(String[] args)
	{
		// creating the threads that are sharing the same Object.
		Calculation cal = new Calculation();
		Factorial t1 = new Factorial(cal,4);
		Factorial t2 = new Factorial(cal,6);
		Addition t3 = new Addition(cal,4,5);
		Addition t4 = new Addition(cal,20,10);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		// threads start their execution.
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	

}
