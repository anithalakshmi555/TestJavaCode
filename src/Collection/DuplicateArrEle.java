package Collection;
/**
 * This program finds the missing number in the array and also finds the duplicate element in the array using array
 * , HshMap  and hash set 
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateArrEle {

	public DuplicateArrEle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,3,5,6};
		int s=0,t=0,d=0,i=0,td=0;
		
		int len=a.length;
		for (i=0;i<len;i++)
			s=s + a[i];
		System.out.println("s" + s);
		td=a[0];
		for (i=0;i<=len;i++) {
			t=t+td;
			td=td+1;}
		System.out.println("t" + t);
		d=t-s;
		System.out.println("d" + d);
		
		String[] ch= {"a","a","b","d","c","c","e"};
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(i=0;i<ch.length;i++) {
		s=1;		
		if(hm.containsKey(ch[i])) {
			hm.put(ch[i],++s);}
		else
		{
			hm.put(ch[i],s);
		}
		}
			
		System.out.println(hm);
		System.out.println(hm.get("2"));
		System.out.println(hm.get("a"));
		
		
		/**
		 * This program finds the duplicate element in the array using array
		 * , HshMap  and hash set 
		 */
		
		int[] arr= {10,3,2,2,3,10,3};
		int[] freq=new int[arr.length];
		int j=0, c=0;
		for(i=0;i<arr.length;i++) {
			c=1;
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[i]!=-1) {
					c=c+1;
					arr[j]=-1;
				}
				
			}
		if (arr[i]!=-1)
			freq[i]=c;
		}
		for(i=0;i<freq.length;i++)
		{
			if(arr[i]!=-1 )
				System.out.println(arr[i] +"       "+freq[i]);
		}
		
		
		// Usinh hashset
		
		HashSet<String> hs = new HashSet<String>();
		String[] s1= {"a","a","b","c","d","d","e"};
		for (i=0;i<s1.length;i++)
		{
			if(!(hs.add(s1[i])))
			{
				System.out.println("Duplcate ele is "+s1[i]);
				
			}
		}	
		
		// Usinh HashMap to find the duplicate elements and number of occurence 
		
				HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
				String[] s2= {"a","a","b","c","d","d","e"};
				for (i=0;i<s1.length;i++)
				{
					
					if(hm1.containsKey(s2[i]))
					{
						hm1.put(s2[i],(hm1.get(s2[i]))+1);
						System.out.println(hm1.get(s2[i]));
									
					}
					else
						hm1.put(s2[i],1);
				}	
		for(Map.Entry m:hm1.entrySet()) {
			System.out.println(m.getKey() + "-------" +m.getValue());
		
			c=hm1.get(s2[i]);
			if(c>1 )
				System.out.println("dup ele is "  + m.getKey());
				
				
		//}
			}
		}
	}


