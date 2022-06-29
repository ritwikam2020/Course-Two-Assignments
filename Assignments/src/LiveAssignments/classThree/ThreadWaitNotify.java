package LiveAssignments.classThree;

class Customer
{
	int balance = 10000;
	synchronized void withdraw(int amount)
	{
		if(amount>this.balance)
		{
			try
			{
				wait();
			}
			catch (Exception e){}
		}
		this.balance-=amount;
		System.out.println("amount wihtdrawn by:"+Thread.currentThread().getName()+" balance now:"+this.balance);
	}
	synchronized void deposit(int amount)
	{
		this.balance+=amount;
		System.out.println("amount deposited by:"+Thread.currentThread().getName()+" balance now:"+this.balance);
		notifyAll();
	}
}
class WDThread extends Thread
{
	Customer cs;
	int amount;
	WDThread(Customer cs,int amt)
	{
		this.amount=amt;
		this.cs=cs;
	}
	public void run()
	{
		cs.withdraw(amount);
	}
}
public class ThreadWaitNotify {
	public static void main(String[] args)
	{
		Customer cs = new Customer();
		WDThread t1 = new WDThread(cs,5000);
		WDThread t2 = new WDThread(cs,4000);
		WDThread t3 = new WDThread(cs,10000);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
		new Thread()
		{
			public void run()
			{
				cs.deposit(20000);
			}
		}.start();
	}
}
