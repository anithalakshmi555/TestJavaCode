package Collection;

import java.util.LinkedList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistAllmethods {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		System.out.println("------add(E element) ----------------");
		ll.add("a");
		ll.add("b");
		ll.add("c");

		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("x");

		LinkedList<String> ll2 = new LinkedList<String>();

		ll2.add("y");
		ll2.add("z");

		LinkedList<String> ll3 = new LinkedList<String>();

		ll3.add("p");

		System.out.println("------Intill Linkedlist ll  ----------------");
		System.out.println(ll);

		System.out.println("------Intill Linkedlist ll 1 ----------------");
		System.out.println(ll1);

		System.out.println("------Intill Linkedlist ll 2 ----------------");
		System.out.println(ll2);

		System.out.println("------Intill Linkedlist ll 3 ----------------");
		System.out.println(ll3);

		System.out.println("------void add(int index,E element)----ll.add(1,\"d\")  adding at 1 pos---------------");
		ll.add(1, "d");
		System.out.println(ll);

		System.out.println("------void addAll(collection)- ll.addlll(ll1); --------------");
		ll.addAll(ll1);
		System.out.println(ll);

		System.out
				.println("------void addlll(int index,Collection )-  adding at 1 pos---ll.addlll(2,ll2);------------");
		ll.addAll(2, ll2);
		System.out.println(ll);

		System.out.println("------void clear-ll3.clear()-------");
		ll3.clear();
		System.out.println(ll3);

		System.out.println("------void isEmpty ll 3----");
		System.out.println(ll3.isEmpty());

		System.out.println("-----contents of col obj ll1--------");
		System.out.println(ll);
		System.out.println("-----E get(index)-------");
		System.out.println("-----2nd ele of ll -----------");
		System.out.println(ll.get(1));

		System.out
				.println("------void addlll(int index,Collection )-  adding at 1 pos---ll.addlll(2,ll2);------------");
		ll.addAll(2, ll2);
		System.out.println(ll);

		System.out.println("------int indexOf(object o)--of y----");
		System.out.println(ll.indexOf("y"));

		System.out.println("------int lastIndexOf(Object o) --Y--");
		System.out.println(ll.lastIndexOf("y"));

		System.out
				.println("------void addlll(int index,Collection )-  adding at 1 pos---ll.addlll(2,ll2);------------");
		ll.addAll(2, ll2);
		System.out.println(ll);

		System.out.println("------boolean contains(obj o)----ll.contains(\"y\"));----");
		System.out.println(ll.contains("y"));

		System.out.println("-----E remove (int index)---------------ll.remove(0);-------");
		ll.remove(0);
		System.out.println(ll);

		System.out.println("-----boolean remove(Object o)-----remove y ------------");
		ll.remove("y");
		System.out.println(ll);

		System.out.println("-----boolean removelll(collection c) ------------");
		ll.removeAll(ll1);
		System.out.println(ll);

		System.out.println("-----boolean removelll(collection c) ------------");
		ll.removeAll(ll1);
		System.out.println(ll);

		System.out.println("-----boolean removeIf(predicate) ---remove Z ---------");
		ll.removeIf(a -> a == "z");
		System.out.println(ll);

		System.out.println(
				"-----boolean contains(object o)------Retruns tr if the list contains the specfied ele---------");
		System.out.println("-----checking y ---------");
		System.out.println(ll.contains("y"));

		System.out.println("-----checking z ---------");
		System.out.println(ll.contains("z"));

		System.out.println("----contents of lll the Linkedlist --------");
		System.out.println(ll);
		System.out.println(ll1);
		System.out.println(ll2);
		System.out.println(ll3);

		System.out.println(
				"-----void retainAll(collection c)  it is used to retain  ll, the elments of the list that are present in the specified collection  ---------");
		// ll.replacelll("q");
		System.out.println("-----Before calling retain all ll2 ------------ll2.retainAll(ll);---------");
		System.out.println(ll2);
		ll2.retainAll(ll);
		System.out.println("-----After  calling retain all ll2 -------------ll2.retainAll(ll);-------------");
		System.out.println(ll2);

		// System.out.println("-----void replacelll(collection c) it is used to replace
		// lll the elments of the list with the specified collection ---------");
		// ll.replacelll("q");
		// System.out.println("-----ll2.replacelll(ll); ---------");
		// ll.replacelll("++");
		// System.out.println(ll);

		System.out.println(
				"-----it is used to replace specified element in the list, present at the specified position  ---------");
		System.out.println("-----E set(int index, E element ---------");
		ll.set(0, "1");
		System.out.println(ll);

		System.out.println("-----sorting the content of the Linkedin ascending   ---------");
		Collections.sort(ll);
		System.out.println(ll);
		/*
		 * ll2.retainlll(ll); System.out.println(ll); System.out.println(ll);
		 */

		System.out.println("-----sorting the content of the Linkedin descending   ---------");
		Collections.sort(ll, Collections.reverseOrder());
		;
		System.out.println(ll);

		System.out.println("-----Size it returns the size of the LinkedList ---------");
		// ll.replacelll("q");
		System.out.println(ll.size());

		System.out.println("----methods which are specific to LinkedList ---------");
		System.out.println(
				"----void addFirst(E e)===ll.addFirst(\"%\");,	void addLast(E e)===ll.addLast(\"£\");----------");
		ll.addFirst("%");
		ll.addLast("£");
		System.out.println(ll);

		System.out.println("---- E getFirst()=ll.getFirst(),	E getLast()=ll.getLast()----------");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		System.out.println("---- E Element--ll.element(),,E get(int index)---ll.get(3)---------");

		System.out.println(ll.element());
		System.out.println(ll.get(3));

		System.out.println(
				"----int indexOf(Obj o)==	ll.indexOf(\"c\"), int lastIndexOf(Obj o)==ll.lastIndexOf(\"y\")-------------");

		System.out.println(ll.indexOf("c"));
		System.out.println(ll.lastIndexOf("y"));

		System.out.println("-------boolean offer(E e))---boolean offerFirst(E e)---	boolean offerLast(E e)----");
		System.out.println("-------offer is simlar to add ----");
		System.out.println(ll.offer("a"));
		System.out.println(ll.offerFirst("a1"));
		System.out.println(ll.offerLast("z"));
		System.out.println(ll);

		System.out.println("-------E peak()   E peakFirst()   E peakLast()----");
		System.out.println("-------offer is simlar to get  ----");
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);

		System.out.println("-------E poll()  			E pollFirst()   			E pollLast()----");
		System.out.println("-------poll  is simlar to remove  ----");
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll);

		System.out.println("All the array contents");
		System.out.println(ll);
		System.out.println(ll1);
		System.out.println(ll2);
		System.out.println(ll3);

		System.out.println("-------remove(), remove(int index)----");
		/*
		 * System.out.println( ll.remove()); System.out.println( ll.remove(1));
		 * System.out.println( ll.removeFirst()); System.out.println( ll.removeLast());
		 * System.out.println( ll);
		 */

		System.out.println(
				"----E remove()--E remove(int index)--boolean remove(obj o)--E removeFirst()--E removeLast()--");
		System.out.println("----boolean removeFirstOccurence(obj o)--boolean removeLastOccurence(obj o)---");
		System.out.println("Array (ll) content before remove");
		System.out.println(ll);

		System.out.println("Array (ll2) content before remove");
		System.out.println(ll2);

		System.out.println("Array  ll.removeFirstOccurrence(ll2);;");
		ll.removeFirstOccurrence("y");
		System.out.println(ll);

		System.out.println("Array  	ll.removeLastOccurrence(ll2)---");
		ll.removeLastOccurrence("y");
		System.out.println(ll);

		System.out.println(ll.remove());
		System.out.println(ll);
		System.out.println("Array content ll.remove(2)");
		System.out.println(ll.remove(2));
		System.out.println(ll);
		System.out.println("Array content ll.remove(ll2))");
		System.out.println(ll.remove(ll2));
		System.out.println(ll);
		System.out.println("Array content ll.removeFirst());");
		System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println("Array content ll.removeLast());");
		System.out.println(ll.removeLast());
		System.out.println(ll);

		System.out.println("-----Adding the elemnets through set --");
		ll.set(0,"replacedwithSet");
		System.out.println(ll);
		
		
		System.out.println("----size of the array---");
		System.out.println(ll.size());
	}

}
