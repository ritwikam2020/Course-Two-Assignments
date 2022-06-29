package LiveAssignments.classThree;

public class ThreadEg extends Thread{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("running thread name is:"+Thread.currentThread().getName());
			   System.out.println("running thread priority is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority());
			   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  
			   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());   
			   System.out.println("Is my thread Daemon or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isDaemon());
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		ThreadEg t1 = new ThreadEg();
		ThreadEg t2 = new ThreadEg();
		ThreadEg t3 = new ThreadEg();
		t1.setPriority(NORM_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
