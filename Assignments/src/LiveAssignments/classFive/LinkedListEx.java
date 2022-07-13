package LiveAssignments.classFive;
import java.util.*;

public class LinkedListEx {
	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("April");
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		ll.add("November");
		ll.addLast("December");
		ll.addFirst("January");
		ll.add(1, "March");
		ll.add(1, "February");
		ll.add(8, "September");
		ll.add(9, "October");
		System.out.println(ll);
		Iterator itr=ll.iterator();
		int i = 0;
		System.out.println("Odd months");
        while(itr.hasNext()) {
        	Object str = itr.next();
        	if(i%2 !=0)
        	{
        		System.out.println(str);
        		//System.out.println(itr.next());
        	}
        	i++;
        }
        Iterator itr1=ll.iterator();
		i = 0;
		
		System.out.println("Even months");
        while(itr1.hasNext()) {
        	Object str = itr1.next();
        	if(i%2 ==0)
        	{
        		System.out.println(str);
        	}
        	i++;
        }
        System.out.println("First and last month"+ll.getFirst()+ll.getLast());
        System.out.println("removing bday"+ll.remove(4));
        System.out.println("winter months? oct, nov, dec,jan"+ll.contains("October")+ll.contains("November")+ll.contains("December")+ll.contains("January"));
		System.out.println("first and last using peek"+ll.peekFirst()+ll.getLast());
		System.out.println("removing first and last using poll"+ll.pollFirst()+ll.pollLast());
		System.out.println(ll);
	}

}

