package Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayList1 {

	public ArrayList1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String>  al = new ArrayList<String>();
		al.add("red");
		al.add("yellow");
		al.add("green");
		al.add("blue");
		al.add("whitee");
		al.add("black");
		al.add("pink");
		al.add("orange");
		al.add("brown");
		
		List<String> ll = new LinkedList<String>();
		LinkedList<String>  ll1 =  new LinkedList<String>();
		ll.add("Linkedlist");
		ll.addAll(al);
		if (ll.contains("red"))
			System.out.println("red is found----------------------");
		if (ll.containsAll(al))
			System.out.println("LL has all ele of al");
		
		
		Iterator itr =al.iterator();
		System.out.println("-------- Iterator -------------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("---------Simple for loop-----------");
		for (int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("---------Advanced for loop------------");
		for(String s: al) {
			System.out.println(s);
		}
		
		System.out.println("--------List Iterator -------------");
		ListIterator ltr= al.listIterator(al.size());
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		
		System.out.println("-----Foreach Lambda1----------------");
		
		al.forEach(a->{System.out.println(a);} );
		
		System.out.println("---------Lambda2------------");
		al.forEach(a2->System.out.println(a2));
		
		
		Iterator<String> itr1 =al.iterator();
		System.out.println("-------foreach reamining -Lambda3------------");
		itr1.forEachRemaining(a->{System.out.println(a);});
	
		
		///-----Sorting the ArraylIts-------------
		System.out.println("----Sorting the ArrayliSt----------------");
		Collections.sort(al);
		al.forEach(a->System.out.println(a));
		
		//	///-----Sorting the ArraylIts in reverse-------------
		System.out.println("----Sorting the ArrayliSt in reverse----------------");
		Collections.sort(al,Collections.reverseOrder());
		al.forEach(a->System.out.println(a));
		
		
	//	System.out.println("----------------------");
		System.out.println("----Linked List-----------------");
		// LinkedList 
		ll.forEach(a->System.out.println(a));
		
		
		System.out.println("----Linked List- after retain all ----------------");	
		ll.retainAll(al);
		ll.forEach(a->System.out.println(a));
		
		
		
		
		ll.remove(0);
		ll.remove("blue");
		
		System.out.println("----Linked List- after remove (0) and remove(object)----------------");	
		ll.forEach(a->System.out.println(a));
		
		//System.out.println("----------------------");
		
		ll.removeIf(s->s=="pink");
		System.out.println("----Linked List- after remove (0) and remove(object)----------------");	
		ll.forEach(System.out::println);
		
		
		ll1.addFirst("Anitha");
		ll1.addAll(ll);
		
		
	}

}
