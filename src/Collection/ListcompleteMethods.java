package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListcompleteMethods {

	public ListcompleteMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<String> al1 = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		al.add("g");
		al.add("h");
		
		al1.add("z");
		al1.add("y");
		al1.add("x");
		
	System.out.println("------Foreach Lambda1 for first ArrayliSt ----------------");
	System.out.println(al);
	
		
	System.out.println("-----Foreach Lambda1 for second ArrayliSt ----------------");
	System.out.println(al1);
		
		System.out.println("-----public boolean addAll----------------");
		al.addAll(al1);
		System.out.println(al);
		
		System.out.println("-----public boolean remove(index)-remove(0)--------------");
		al.remove(0);
		System.out.println(al);
		
		System.out.println("-----public boolean removeAll(Collection) of Secondarraylist----------------");
		al.removeAll(al1);
		System.out.println(al);
		
		System.out.println("-----public boolean removeIf-element e --------------");
		al.removeIf(a->a=="e");
		System.out.println(al);
		
		
		System.out.println("-----Re initializing the arraylist 2 --------------");
		al1.add("z");
		al1.add("y");
		al1.add("x");
		al1.add("c");
		al1.add("b");
		System.out.println(al1);
		
		System.out.println("-----Contents of array list 1 --------------");
		System.out.println(al);
		
		
		System.out.println("----public boolean retainALL----Matching between al and al1 is printed --------------");
		al.retainAll(al1);
		System.out.println(al);
		
		System.out.println("----public int size --------------");
		
		System.out.println("size of the arraylist is "+	al.size());
		
		
		System.out.println("----public void clear() --------------");
		System.out.println(al1);
		System.out.println("----After public void clear() --------------");
		al1.clear();
		System.out.println(al1);
		
		
		System.out.println("---- public boolean isEmpty() --------------");
		al1.isEmpty();
		System.out.println(al1.isEmpty());
		
		
		
		System.out.println("-----Re initializing the arraylist 2 --------------");
		al1.add("z");
		al1.add("y");
		al1.add("x");
		al1.add("c");
		al1.add("b");
		System.out.println(al1);
		
		System.out.println("----public boolean contains(object element) ------Element x--------");
		System.out.println(al1.contains("x"));
		
		
		System.out.println("----public boolean containsAll(collection) ------Element al--------");
		System.out.println(al1.contains(al));
		
		
		System.out.println("----Contents of the arraylist al1-second array -------");
		System.out.println(al1);
		
		System.out.println("----public Object[] = toArray() it converts collection into array--------------");
		Object[] arr = al1.toArray();
		
		System.out.println("----Content of the object array is printed--------------");
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		
		System.out.println("----public boolean equals(Object element)--------------");
		System.out.println("----Content of the first col obj------------");
		System.out.println(al);
		System.out.println("----Content of the second col obj------------");
		System.out.println(al1);
		
		System.out.println("----public boolean equals(Object element)--------------");
		System.out.println(al.equals(al1));
		
		System.out.println("----public int hashcode-  hash code of al------------");
		System.out.println(al.hashCode());
		
		List<String> al2 = new ArrayList<String>();
		al2.add("b");
		al2.add("c");
		
		List<String> al3 = new ArrayList<String>();
		al3.add("c");
		al3.add("b");
		
		
		System.out.println("---------1st col obj----");
		System.out.println(al);
		System.out.println("---------2nd  col obj----");
		System.out.println(al1);
		System.out.println("---------3rd  col obj----");
		System.out.println(al2);
		System.out.println("---------4th  col obj----");
		System.out.println(al3);
		
		
		System.out.println("---------comparing 1st and 2nd ----");
		System.out.println(al.equals(al1));
		
		System.out.println("---------comparing 1st  and 3rd ----");
		System.out.println(al.equals(al2));
		
		
		System.out.println("---------1st and 4th ----");
		System.out.println(al.equals(al3));
	}

}
