package LiveAssignments.classOne;
class Person
{
	void work()
	{
		System.out.println("Person works");
	}
	void eat()
	{
		System.out.println("Person eats");
	}
	void sleep()
	{
		System.out.println("Person sleeps");
	}
	
}
class Employee extends Person
{
	void work()
	{
		System.out.println("employee works");
	}
	void eat()
	{
		System.out.println("employee eats");
	}
}
class Student extends Person
{
	void sleep()
	{
		System.out.println("Student sleeps");
	}
}
class Teacher extends Person
{
	void work()
	{
		System.out.println("Teacher works");
	}
	void eat()
	{
		System.out.println("Teacher eats");
	}
	void sleep()
	{
		System.out.println("Teacher sleeps");
	}
}
class RoleOthers extends Person
{
	void work()
	{
		System.out.println("RoleOthers works");
	}
}


public class Polymorphism {
	public static void main(String[] args)
	{
		Person pr = new Employee();
		System.out.println("Employee results:");
		pr.work();pr.eat();
		pr = new Student();
		System.out.println("Student results:");
		pr.sleep();
		pr = new Teacher();
		System.out.println("Teacher results:");
		pr.work();pr.eat();pr.sleep();
		pr = new RoleOthers();
		System.out.println("RoleOthers results:");
		pr.work();
		
	}

}
