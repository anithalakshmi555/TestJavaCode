package Collection;
import java.util.*;
import java.util.HashSet;
import java.util.TreeSet;

public class Treemap {

	public Treemap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	tm.put(10,"amith");
	tm.put(21,"rakesh");
	tm.put(2,"latha");
	tm.put(300,"nissi");
	tm.put(1,"rohan");
	tm.put(6,"chirag");
	
	System.out.println(tm);
	
	for(Map.Entry m: tm.entrySet())
		System.out.println(m.getKey()+"------"+m.getValue());
	}
	
	
}
