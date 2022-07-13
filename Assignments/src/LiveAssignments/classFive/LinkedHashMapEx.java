package LiveAssignments.classFive;
import java.util.*;
public class LinkedHashMapEx {
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		lhm.put(1, new String("Apple"));
		lhm.put(2, new String("Orange"));
		lhm.put(3, new String("Kiwi"));
		lhm.put(4, new String("Peach"));
		lhm.put(5, new String("Melon"));
		lhm.put(6, new String("Banana"));
		lhm.put(7, new String("Plum"));
		lhm.put(8, new String("Grape"));
		lhm.put(9, new String("Lime"));
		lhm.put(10, new String("Berry"));
		System.out.println(lhm);
		for (Integer key : lhm.keySet()) {
            System.out.println(key + ":\t" + lhm.get(key));
        }
		System.out.println("removing 4th fruit using value"+lhm.remove(4,"Peach"));
		System.out.println("removing 7th fruit using key"+lhm.remove(7));
		System.out.println("Map contains banana and apple"+lhm.containsValue("Apple")+lhm.containsValue("Banana"));
		System.out.println("Containf 4th key?"+lhm.containsKey(4));
		System.out.println("Hashcode of map"+lhm.hashCode());
		System.out.println("Clear map");
		lhm.clear();
	}

}
