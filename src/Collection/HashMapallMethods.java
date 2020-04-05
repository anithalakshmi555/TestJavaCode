package Collection;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapallMethods {

	public HashMapallMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"z");
		hm.put(20,"x");
		hm.put(300,"c");
		hm.put(41,"y");
		hm.put(5,"e");
		
		System.out.println(hm);
		for(Map.Entry entry : hm.entrySet())
			System.out.println(entry.getKey() + "        "+entry.getValue());
		
		System.out.println("--------Sorting on key  Asc--------");
		Set s= hm.entrySet();
		s.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		System.out.println("--------Sorting on key  Desc--------");
		Set s1= hm.entrySet();
		s1.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		System.out.println("--------Sorting on key Value Asc--------");
		Set s2= hm.entrySet();
		s2.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);

		System.out.println("--------Sorting on key Value Desc--------");
		Set s3= hm.entrySet();
		s3.stream()
		.sorted(Map.Entry.comparingByKey((Comparator.reverseOrder())))
		.forEach(System.out::println);
	}

}
