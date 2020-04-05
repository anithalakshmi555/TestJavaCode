package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Stack12 {

	public Stack12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Stack al = new Stack();
		
		System.out.println("------push(E element) ----------------");
		al.push("a");
		al.push("b");
		al.push("c");
		al.push("d");
		System.out.println(al);
		
		
		System.out.println("---al.peek()----");
		al.peek();
		System.out.println(al);
		
		
		System.out.println("---al.pop()----");
		al.pop();
		System.out.println(al);
		
		
		System.out.println("---al.empty()----");
		System.out.println(al.empty());
		
		System.out.println("---al.search()- element c---");
		System.out.println(al.search("c"));
		System.out.println("---al.search()- element a---");
		System.out.println(al.search("a"));
		System.out.println("---al.search()- element b---");
		System.out.println(al.search("b"));
		System.out.println(al);
		
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("x");
		
		ArrayList<String> al2 = new ArrayList<String>();
	
		al2.add("y");
		al2.add("z");
		

		ArrayList<String> al3 = new ArrayList<String>();
	
		al3.add("p");
		
		
		System.out.println("------Intial Arraylist al  ----------------");
		System.out.println(al);
		
		System.out.println("------Intial Arraylist al 1 ----------------");
		System.out.println(al1);
		
		System.out.println("------Intial Arraylist al 2 ----------------");
		System.out.println(al2);
		
		System.out.println("------Intial Arraylist al 3 ----------------");
		System.out.println(al3);
		
		System.out.println("------void add(int index,E element)----al.add(1,\"d\")  adding at 1 pos---------------");
		al.add(1,"d");
		System.out.println(al);
		
		System.out.println("------void addAll(collection)- al.addAll(al1); --------------");
		al.addAll(al1);
		System.out.println(al);
		
			
		System.out.println("------void addAll(int index,Collection )-  adding at 1 pos---al.addAll(2,al2);------------");
		al.addAll(2,al2);
		System.out.println(al);
		
		
		System.out.println("------void clear-al3.clear()-------");
		al3.clear();
		System.out.println(al3);
		
		System.out.println("------void isEmpty al 3----");
		System.out.println(al3.isEmpty());
		
		
		
		System.out.println("-----contents of col obj al1--------");
		System.out.println(al);
		System.out.println("-----E get(index)-------");
		System.out.println("-----2nd ele of al -----------");
		System.out.println(al.get(1));
		
		System.out.println("------void addAll(int index,Collection )-  adding at 1 pos---al.addAll(2,al2);------------");
		al.addAll(2,al2);
		System.out.println(al);
		
		System.out.println("------int indexOf(object o)--of y----");
		System.out.println(al.indexOf("y"));
		
		
		System.out.println("------int lastIndexOf(Object o) --Y--");
		System.out.println(al.lastIndexOf("y"));
	
		System.out.println("------void addAll(int index,Collection )-  adding at 1 pos---al.addAll(2,al2);------------");
		al.addAll(2,al2);
		System.out.println(al);
		
		
		System.out.println("------boolean contains(obj o)----al.contains(\"y\"));----");
		System.out.println(al.contains("y"));
		
		
		System.out.println("-----E remove (int index)---------------al.remove(0);-------");
		al.remove(0);
		System.out.println(al);
		
		System.out.println("-----boolean remove(Object o)-----remove y ------------");
		al.remove("y");
		System.out.println(al);
		
		System.out.println("-----boolean removeAll(collection c) ------------");
		al.removeAll(al1);
		System.out.println(al);
		
		
		
		System.out.println("-----boolean removeAll(collection c) ------------");
		al.removeAll(al1);
		System.out.println(al);
		

		System.out.println("-----boolean removeIf(predicate) ---remove Z ---------");
		al.removeIf(a->a=="z");
		System.out.println(al);
		
		System.out.println("-----boolean contains(object o)------Retruns tr if the list contains the specfied ele---------");
		System.out.println("-----checking y ---------");
		System.out.println(al.contains("y"));
		
		System.out.println("-----checking z ---------");
		System.out.println(al.contains("z"));
		
		
		System.out.println("----contents of all the arraylist --------");
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);
		
		System.out.println("-----void retainAll(collection c)  it is used to ratin all the elments of the list that are present in the specified collection  ---------");
		//al.replaceAll("q");
		System.out.println("-----al2.retainAll(al); ---------");
		al2.retainAll(al);
		System.out.println(al2);
		
	//	System.out.println("-----void replaceAll(collection c)  it is used to replace  all the elments of the list with the  specified collection  ---------");
		//al.replaceAll("q");
		//System.out.println("-----al2.replaceAll(al); ---------");
		//al.replaceAll("++");
		//System.out.println(al);
		
		
		System.out.println("-----it is used to replace specified element in the list, present at the specified position  ---------");
		System.out.println("-----E set(int index, E element ---------");
		al.set(0,"1");
		System.out.println(al);
		
		System.out.println("-----sorting the content of the arrayin ascending   ---------");
		Collections.sort(al);
		System.out.println(al);
		/*
		 * al2.retainAll(al); System.out.println(al); System.out.println(al);
		 */
		
		System.out.println("-----sorting the content of the arrayin descending   ---------");
		Collections.sort(al,Collections.reverseOrder());;
		System.out.println(al);
		
		
		System.out.println("-----Size it returns the size of the arrayList ---------");
		//al.replaceAll("q");
		System.out.println(al.size());
		

	}

}
