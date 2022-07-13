package LiveAssignments.classFive;
import java.util.*;
public class StackEx {
	public static void main(String[] args)
	{
		Stack stk = new  Stack();
		stk.push("Apple");
		stk.push("Banana");
		stk.push("Orange");
		stk.push("Kiwi");
		stk.push("Peach");
		stk.push("Durgapur");
		stk.push("Kolkata");
		stk.push("Bangalore");
		stk.push("Delhi");
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push('a');
		stk.push('b');
		System.out.println(stk);
		System.out.println("Removing five elements");
		for(int i=0;i<5;i++)
		{
			stk.pop();
		}
		System.out.println("Peeking element"+stk.peek());
		for(int i=0;i<2;i++)
		{
			stk.pop();
		}
		System.out.println("Polling 2 element"+stk.removeElement(3)+stk.removeElement("Durgapur"));
		System.out.println("Polling element"+stk.peek());
		System.out.println("Index of Apple and Delhi element"+stk.indexOf("Apple")+stk.indexOf("Kolkata"));
	}

}
