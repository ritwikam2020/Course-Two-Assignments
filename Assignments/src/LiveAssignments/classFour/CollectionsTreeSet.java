package LiveAssignments.classFour;
import java.util.*;
public class CollectionsTreeSet {
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();
		Scanner input = new Scanner(System.in); // comnnad line to take user input
		System.out.println("Please enter 6 programming languages:");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        String s4 = input.nextLine();
        String s5 = input.nextLine();
        String s6 = input.nextLine();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		System.out.println("Before removal"+ts);
		ts.remove(s3);ts.remove(s4);
		System.out.println("After removal"+ts);
		System.out.println("Please enter 3 more programming languages:");
		String s7 = input.nextLine();
        String s8 = input.nextLine();
        String s9 = input.nextLine();
        ts.add(s7);
		ts.add(s8);
		ts.add(s8);
		System.out.println("after adding final elements"+ts);
		System.out.println("Checking if java is a part:"+ts.contains("Java"));
		ts.clear();
		System.out.println("removed all elements:"+ts);
	}

}
