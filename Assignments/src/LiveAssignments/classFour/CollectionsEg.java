package LiveAssignments.classFour;
import java.util.*;
public class CollectionsEg {
	public static void main(String[] args)
	{
		LinkedHashSet lst = new LinkedHashSet();
		lst.add(20);
		lst.add(40);
		lst.add(56.98);
		lst.add(98.567);
		lst.add('a');
		lst.add('b');
		lst.add(true);
		System.out.println("contents of lst:"+lst);
		//intergeet hashset
		LinkedHashSet<Integer> lst1 = new LinkedHashSet<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a numner between 1 to 8");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int num6 = sc.nextInt();
		int num7 = sc.nextInt();
		lst1.add(num);
		lst1.add(num1);
		lst1.add(num2);
		lst1.add(num3);
		lst1.add(num4);
		lst1.add(num5);
		lst1.add(num6);
		lst1.add(num7);
		System.out.println("contents of lst1:"+lst1);
	}

}
