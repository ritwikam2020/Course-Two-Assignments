package LiveAssignments.classOne;

abstract class vehicle
{
	int speed;
	long dist;
	abstract public void run();
	abstract public void stop();
	vehicle()
	{
		System.out.println("inside default constructor of vehicle");
	}
	vehicle(int speed, long dist)
	{
		this.speed = speed;
		this.dist = dist;
	}
	public void fuel(int a)
	{
		System.out.println("fuel with int"+ a);
	}
	public void fuel(float a, String b)
	{
		System.out.println("fuel with float and String"+ a +"and" +b);
	}
	public void fuel(char a, int c)
	{
		System.out.println("fuel with char and int"+ a +"and" +c);
	}
	
}

class TwoWheeler extends vehicle
{
	int speed = 30;
	long dist= 100;
	int no_of_tyre = 2;
	public void run()
	{
		System.out.println("twosheeler runs");
	}
	public void stop()
	{
		System.out.println("twosheeler stops");
	}
	TwoWheeler()
	{
		super(500,2000);
		System.out.println("inside default constructor of TwoWheeler");
	}
	public void display()
	{
		System.out.println("values of 2W are: Speed:"+this.speed+"dist:"+this.dist+"tyre"+this.no_of_tyre);
		System.out.println("variables of vehicle from 2W- dist:"+super.dist+"speed:"+super.speed);
	}
}

class ThreeWheeler extends vehicle
{
	int speed = 50;
	long dist= 300;
	int no_of_tyre = 3;
	public void run()
	{
		System.out.println("ThreeWheeler runs");
	}
	public void stop()
	{
		System.out.println("ThreeWheeler stops");
	}
	ThreeWheeler()
	{
		super(500,2000);
		System.out.println("inside default constructor of ThreeWheeler");
	}
	public void display()
	{
		System.out.println("values of 3W are: Speed:"+this.speed+"dist:"+this.dist+"tyre"+this.no_of_tyre);
		System.out.println("variables of vehicle from 3W- dist:"+super.dist+"speed:"+super.speed);
	}
}
class FourWheeler extends vehicle
{
	int speed = 200;
	long dist= 1000;
	int no_of_tyre = 4;
	public void run()
	{
		System.out.println("FourWheeler runs");
	}
	public void stop()
	{
		System.out.println("FourWheeler stops");
	}
	FourWheeler()
	{
		super(500,2000);
		System.out.println("inside default constructor of FourWheeler");
	}
	public void display()
	{
		System.out.println("values of 4W are: Speed:"+this.speed+"dist:"+this.dist+"tyre"+this.no_of_tyre);
		System.out.println("variables of vehicle from 4W- dist:"+super.dist+"speed:"+super.speed);
	}
}
class EightWheeler extends vehicle
{
	int speed = 300;
	long dist= 1500;
	int no_of_tyre = 8;
	public void run()
	{
		System.out.println("EightWheeler runs");
	}
	public void stop()
	{
		System.out.println("EightWheeler stops");
	}
	EightWheeler()
	{
		super(500,2000);
		System.out.println("inside default constructor of EightWheeler");
	}
	public void display()
	{
		System.out.println("values of 8W are: Speed:"+this.speed+"dist:"+this.dist+"tyre"+this.no_of_tyre);
		System.out.println("variables of vehicle from 8W- dist:"+super.dist+"speed:"+super.speed);
	}
}

public class AbstractClass {
	public static void main(String[] args)
	{
		vehicle v = new TwoWheeler();
		v.run();
		v.stop();
		v = new ThreeWheeler();
		v.run();
		v.stop();
		v = new FourWheeler();
		v.run();
		v.stop();
		v = new EightWheeler();
		v.run();
		v.stop();
		v.fuel(10);
		v.fuel('F', 300);
		v.fuel(90.8f , "Fuel");
		TwoWheeler two = new TwoWheeler();
		two.display();
		ThreeWheeler three = new ThreeWheeler();
		three.display();
		FourWheeler four = new FourWheeler();
		four.display();
		EightWheeler eight = new EightWheeler();
		eight.display();
	}

}
