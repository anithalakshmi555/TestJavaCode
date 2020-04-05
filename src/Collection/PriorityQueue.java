package Collection;

import java.util.*;
import java.util.PriorityQueue;


public class PriorityQueue {

	public PriorityQueue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue();
		PriorityQueue<String> pq1 = new PriorityQueue();
		PriorityQueue<String> pq2 = new PriorityQueue();
		
		pq.add("a");
		pq.add("b");
		pq.add("c");
		pq.add("d");
		pq.add("e");
		pq.add("f");
		pq.add("g");
		pq1.addAll(pq);
		
		System.out.println("Trying to add the same element a again and it returns false");
		System.out.println(pq.add("a"));
		System.out.println(pq);
		
		System.out.println("------- size of the pq1----");
		System.out.println(pq1.size());

	}

}
