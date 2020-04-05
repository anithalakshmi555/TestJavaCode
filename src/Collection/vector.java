package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class vector {

	public vector() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		System.out.println("------add(E element) ----------------");
		v.add("a");
		v.add("b");
		v.add("c");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("x");
		
		ArrayList<String> al2 = new ArrayList<String>();
	
		al2.add("y");
		al2.add("z");
		

		ArrayList<String> al3 = new ArrayList<String>();
	
		al3.add("p");
		
		
		System.out.println("------Intial Arraylist v  ----------------");
		System.out.println(v);
		
		System.out.println("------Intial Arraylist v 1 ----------------");
		System.out.println(al1);
		
		System.out.println("------Intial Arraylist v 2 ----------------");
		System.out.println(al2);
		
		System.out.println("------Intial Arraylist v 3 ----------------");
		System.out.println(al3);
		
		System.out.println("------void add(int index,E element)----v.add(1,\"d\")  adding at 1 pos---------------");
		v.add(1,"d");
		System.out.println(v);
		
		System.out.println("------void addAll(collection)- v.addAll(al1); --------------");
		v.addAll(al1);
		System.out.println(v);
		
			
		System.out.println("------void addAll(int index,Collection )-  adding at 1 pos---v.addAll(2,al2);------------");
		v.addAll(2,al2);
		System.out.println(v);
		
		
		System.out.println("------void clear-al3.clear()-------");
		al3.clear();
		System.out.println(al3);
		
		System.out.println("------void isEmpty v 3----");
		System.out.println(al3.isEmpty());
		
		
		
		System.out.println("-----contents of col obj al1--------");
		System.out.println(v);
		System.out.println("-----E get(index)-------");
		System.out.println("-----2nd ele of v -----------");
		System.out.println(v.get(1));
		
		System.out.println("------void addAll(int index,Collection )-  adding at 1 pos---v.addAll(2,al2);------------");
		v.addAll(2,al2);
		System.out.println(v);
		
		System.out.println("------int indexOf(object o)--of y----");
		System.out.println(v.indexOf("y"));
		
		
		System.out.println("------int lastIndexOf(Object o) --Y--");
		System.out.println(v.lastIndexOf("y"));
	
		System.out.println("------void addAll(int index,Collection )-  adding at 1 pos---v.addAll(2,al2);------------");
		v.addAll(2,al2);
		System.out.println(v);
		
		
		System.out.println("------boolean contains(obj o)----v.contains(\"y\"));----");
		System.out.println(v.contains("y"));
		
		
		System.out.println("-----E remove (int index)---------------v.remove(0);-------");
		v.remove(0);
		System.out.println(v);
		
		System.out.println("-----boolean remove(Object o)-----remove y ------------");
		v.remove("y");
		System.out.println(v);
		
		System.out.println("-----boolean removeAll(collection c) ------------");
		v.removeAll(al1);
		System.out.println(v);
		
		
		
		System.out.println("-----boolean removeAll(collection c) ------------");
		v.removeAll(al1);
		System.out.println(v);
		

		System.out.println("-----boolean removeIf(predicate) ---remove Z ---------");
		v.removeIf(a->a=="z");
		System.out.println(v);
		
		System.out.println("-----boolean contains(object o)------Retruns tr if the list contains the specfied ele---------");
		System.out.println("-----checking y ---------");
		System.out.println(v.contains("y"));
		
		System.out.println("-----checking z ---------");
		System.out.println(v.contains("z"));
		
		
		System.out.println("----contents of all the arraylist --------");
		System.out.println(v);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);
		
		System.out.println("-----void retainAll(collection c)  it is used to ratin all the elments of the list that are present in the specified collection  ---------");
		//v.replaceAll("q");
		System.out.println("-----al2.retainAll(v); ---------");
		al2.retainAll(v);
		System.out.println(al2);
		
	//	System.out.println("-----void replaceAll(collection c)  it is used to replace  all the elments of the list with the  specified collection  ---------");
		//v.replaceAll("q");
		//System.out.println("-----al2.replaceAll(v); ---------");
		//v.replaceAll("++");
		//System.out.println(v);
		
		
		System.out.println("-----it is used to replace specified element in the list, present at the specified position  ---------");
		System.out.println("-----E set(int index, E element ---------");
		v.set(0,"1");
		System.out.println(v);
		
		System.out.println("-----sorting the content of the arrayin ascending   ---------");
		Collections.sort(v);
		System.out.println(v);
		/*
		 * al2.retainAll(v); System.out.println(v); System.out.println(v);
		 */
		
		System.out.println("-----sorting the content of the arrayin descending   ---------");
		Collections.sort(v,Collections.reverseOrder());;
		System.out.println(v);
		
		
		System.out.println("-----Size it returns the size of the vector ---------");
		//v.replaceAll("q");
		System.out.println(v.size());
		
		System.out.println("-----Capacity of the vector---------");
		
		System.out.println(v.capacity());
		System.out.println("----Elements  of the vector--------");	
		System.out.println(v);
		System.out.println("-----v.elementAt(0);---------");
		System.out.println(v.elementAt(0));
		System.out.println(v.elements());
		System.out.println(v.firstElement());
		//v.indexOf(v3, 2);
		

	}

}
