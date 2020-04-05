package Collection;

import java.util.HashSet;

public class HashsetallMethods {

	public HashsetallMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	HashSet<String> hs1 = new HashSet<String>();
	HashSet<String> hs2 = new HashSet<String>();
	HashSet<String> hs3 = new HashSet<String>();
	
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
