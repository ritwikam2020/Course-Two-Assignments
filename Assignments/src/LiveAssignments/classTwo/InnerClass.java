package LiveAssignments.classTwo;

class Employee
{
	int salary = 1000;
	class PermEmployee
	{
		int salary = Employee.this.salary;
		String code = "PE01";
		float hike = .45f;
		void new_salary()
		{
			System.out.println("new salary of PermEmployee"+(this.salary+(this.salary*this.hike)));
		}
		void display()
		{
			System.out.println("PermEmployee: salary+code+hike"+this.salary+" "+this.code+" " +this.hike);
		}
	}
	
	class TempEmployee
	{
		int salary = Employee.this.salary;
		String code = "TE01";
		float hike = .30f;
		void new_salary()
		{
			System.out.println("new salary of TempEmployee"+(this.salary+(this.salary*this.hike)));
		}
		void display()
		{
			System.out.println("TempEmployee: salary+code+hike"+this.salary+" "+this.code+" " +this.hike);
		}
	}
	
	void role()
	{
		class ContractEmployee
		{
			int salary = Employee.this.salary;
			String code = "CE01";
			float hike = .30f;
			void new_salary()
			{
				System.out.println("new salary of ContractEmployee"+(this.salary+(this.salary*this.hike)));
			}
			void display()
			{
				System.out.println("ContractEmployee: salary+code+hike"+this.salary+" "+this.code+" " +this.hike);
			}
		}
		ContractEmployee CE = new ContractEmployee();
		CE.new_salary();
		CE.display();
	}
}

public class InnerClass {
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		Employee.PermEmployee prm = emp.new PermEmployee(); 
		Employee.TempEmployee tmp = emp.new TempEmployee();
		prm.display();
		prm.new_salary();
		tmp.display();
		tmp.new_salary();
		emp.role();
	}
}
