package Collection;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.TreeSet;

public class Treesetallmethods {

	public Treesetallmethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<String> ts = new TreeSet<String>();
		TreeSet<String> ts1 = new TreeSet<String>();
		TreeSet<String> ts2 = new TreeSet<String>();
		TreeSet<String> ts3 = new TreeSet<String>();
		
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
		ts.add("f");
		ts.add("g");
		ts1.addAll(ts);
		
		System.out.println("Trying to add the same element a again and it returns false");
		System.out.println(ts.add("a"));
		System.out.println(ts);
		
		System.out.println("------- size of the ts1----");
		System.out.println(ts1.size());
		
		ts2.addAll(ts1);
		System.out.println("------- the content of  the ts----");
		System.out.println(ts);
		System.out.println("------- the content of  the ts1----");
		System.out.println(ts1);
		System.out.println("------- the content of  the ts2---");
		System.out.println(ts2);
		System.out.println("-------the content of  the ts3---");
		System.out.println(ts3);
		
		System.out.println("------- clearing the content of  the ts2----");
		ts2.clear();
		System.out.println(ts2);
		System.out.println("------- is Empty ts2----");
		ts2.clear();
		System.out.println(ts2.isEmpty());
		
		

		System.out.println("-------ts ----");
		System.out.println(ts);
		System.out.println("------boolean contains(obj o)  obj d ----");
		System.out.println(ts.contains("d"));
		
		System.out.println("------boolean remove(obj o)  obj d ----");
		System.out.println("------ts ----");
		System.out.println(ts);
		System.out.println("------after the removal of the object  ----");
		System.out.println(ts.remove("d"));
		System.out.println(ts);

		
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
		ts.add("f");
		ts.add("g");
		System.out.println("-----Ascending---------");
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----Descending---------");
		Iterator<String> itr1 = ts.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
