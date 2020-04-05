package Collection;
import java.util.*;


public class HashMap1 {

	public HashMap1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HashMap<Integer,String>  hm = new HashMap<Integer,String>();
		HashMap<Integer,String>  hm1 = new HashMap<Integer,String>();
		HashMap<Integer,String>  hm2 = new HashMap<Integer,String>();
		HashMap<Integer,String>  hm3 = new HashMap<Integer,String>();
		
		hm.put(1,"Amit");
		hm.put(23,"cat");
		hm.put(3,"dog");
		hm.put(90,"rat");
		hm.put(5,"peacock");
	//	Set s=hm.entrySet();
		
		System.out.println("After invoking the put method");
		for(Map.Entry m:hm.entrySet() )
			System.out.println(m.getKey() + "   " + m.getValue());
		
		hm.putIfAbsent(10,"pigeon");
		for(Map.Entry m:hm.entrySet() )
			System.out.println(m.getKey() + "   " + m.getValue());
		
		hm1.put(104,"parrot");
		hm1.putAll(hm);
		
		System.out.println("printing the elements of hm2 ");
		for(Map.Entry m: hm1.entrySet())
			System.out.println(m.getKey()+ "     "+ m.getValue());
		
		
		// To remove the elements
		hm2.putAll(hm1);
		System.out.println(hm2);
		hm2.remove(23);
		hm2.remove(5);
		System.out.println(hm2);
		
		System.out.println("printing the elements of hm3 ");
		//To replace the elements
		hm3.putAll(hm1);
		System.out.println(hm3);
		hm3.replace(23,"ballon");
		hm3.replace(5,"peacock","tiger");
		System.out.println(hm3);
		hm3.replaceAll((k,v)->"Ajay");
		System.out.println(hm3);
		System.out.println(hm.get(5));
	}

}
