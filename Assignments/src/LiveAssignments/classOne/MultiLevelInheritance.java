package LiveAssignments.classOne;

class Product
{
	int id = 78;
	String name = "Amul";
	Product()
	{
		System.out.println("id+name = "+this.id+" "+this.name);
	}
}

class A extends Product
{
	int count = 50;
	String catagory = "Butter";
	A()
	{
		System.out.println("printing all variables:" +this.count+this.catagory);
	}
}

class B extends Product
{
	int count = 90;
	String catagory = "Milk";
	B()
	{
		System.out.println("printing all variables:" +this.count+this.catagory);
	}
}

class C extends Product
{
	int count = 56;
	String catagory = "choco";
	C()
	{
		System.out.println("printing all variables:" +this.count+this.catagory);
	}
	
}

class subA extends A
{
	int price = 30;
	public void totalPrice()
	{
		System.out.println("id+name+catagory" +super.id+super.name+super.catagory);
		System.out.println("price" +super.count*price);
	}
}

class subB extends B
{
	int price = 30;
	public void totalPrice()
	{
		System.out.println("id+name+catagory" +super.id+super.name+super.catagory);
		System.out.println("price" +super.count*price);
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args)
	{
		subA sa = new subA();
		subB sb = new subB();
		sa.totalPrice();
		sb.totalPrice();
		
	}
	

}
