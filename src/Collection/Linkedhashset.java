package Collection;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public Linkedhashset() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>();
		LinkedHashSet<String> hs2 = new LinkedHashSet<String>();
		LinkedHashSet<String> hs3 = new LinkedHashSet<String>();
		
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		hs.add("f");
		hs.add("g");
		hs1.addAll(hs);
		
		System.out.println("Trying to add the same element a again and it returns false");
		System.out.println(hs.add("a"));
		System.out.println(hs);
		
		System.out.println("------- size of the hs1----");
		System.out.println(hs1.size());
		
		hs2.addAll(hs1);
		System.out.println("------- clearing the content of  the hs2----");
		hs2.clear();
		System.out.println(hs2);
		System.out.println("------- is Empty hs2----");
		hs2.clear();
		System.out.println(hs2.isEmpty());
		
		

		System.out.println("-------hs ----");
		System.out.println(hs);
		System.out.println("------boolean contains(obj o)  obj d ----");
		System.out.println(hs.contains("d"));
		
		System.out.println("------boolean remove(obj o)  obj d ----");
		System.out.println("------hs ----");
		System.out.println(hs);
		System.out.println(hs.remove("d"));
		System.out.println(hs);

	}

}
