package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Stringfunctions {

	public Stringfunctions() {
		// TODO Auto-generated constructor stub
	}

	public static <DateTime> void main(String[] args) {
		String s= "welcome";
		String s2="welcome";
		String s3="WELcome";
		//Functions starting with C
		System.out.println("Character at the pos"+s.charAt(1));
		System.out.println("concatinate with another string "+s.concat("  to home"));
		System.out.println("conains function returns "+s.contains("come"));
		
		
		
		//Functions starting with e
		System.out.println("Function Equals "+s.equals(s2));
		System.out.println("Function Equals by ignoring the case "+s.equalsIgnoreCase(s3));
		System.out.println(s.charAt(1));
		
		
		//Functions starting with F
		System.out.println("Formatting the string ");
		
		//Prints the whole string.
		System.out.println(String.format("|%s|", "Hello World")); // prints: "Hello World"
		
		//Specify Field Length
		System.out.println(String.format("|%30s|", "Hello World")); // prints: | Hello World|
		
		//Left Justify Text
		System.out.println(String.format("|%-30s|", "Hello World")); // prints: |Hello World |
		
		//Specify Maximum Number of Characters
		System.out.println(String.format("|%.5s|", "Hello World")); // prints: |Hello|
		
		
		
		System.out.println("Formatting the Integer  ");
		
		//Prints the whole string.
		System.out.println(String.format("%d", 93)); // prints 93, 
		
		//Specify Field Length
		System.out.println(String.format("|%20d|", 93)); 
		
		//Left Justify Text
		System.out.println(String.format("|%-30d|", 20)); 
		
		//padding with zero
		System.out.println(String.format("|%020d|", 95));
		
		
		
		//Use locale-specific thousands separator:		For the US locale, it is “,”:
		System.out.println(String.format("|%,d|", 10000000));
	//	String.format(format, args)
		
		System.out.println(s.format("%2s", s2));
		System.out.println(s.format("%3s", s2));
		
		System.out.println(s.format("%2s", s2));
		
		

		//create date time 2008-03-09 16:05:07.123
		/*
		 * Date dt = new Date( Date dt = new Date();
		 * 
		 * 
		 * System.out.println(s.format(String.Format("(0:y yy yyy yyyy)", dt));
		 */
		
		
		// function with indexOf, intern  
		   String str1 = new String("This is a BeginnersBook tutorial");
	       String str2 = new String("Beginners");
	       String str3 = new String("Book");
	       String str4 = new String("Books");
	       System.out.println("Index of B in str1: "+str1.indexOf('B'));
	       System.out.println("Index of B in str1 after 15th char:"+str1.indexOf('B', 15));
	       System.out.println("Index of B in str1 after 30th char:"+str1.indexOf('B', 30));
	       System.out.println("Index of string str2 in str1:"+str1.indexOf(str2));
	       System.out.println("Index of str2 after 15th char"+str1.indexOf(str2, 15));
	       System.out.println("Index of string str3:"+str1.indexOf(str3));
	       System.out.println("Index of string str4"+str1.indexOf(str4));
	       System.out.println("Index of hardcoded string:"+str1.indexOf("is"));
	       System.out.println("Index of hardcoded string after 4th char:"+str1.indexOf("is", 4));
		
		
	       
	       
	       //Intern
	       
	       /**
	        * Java String intern() method is used for getting the string from the memory if it is already present. 
	        * This method ensures that all the same strings share the same memory. For example, creating a string 
	        * “hello” 10 times using intern() method would ensure that there will be only one instance of “Hello” in
	        *  the memory and all the 10 references point to the same instance.
	        */
	     	/* The Java String intern() method searches the string "beginnersbook"  
		   	 * in the memory pool and returns the reference of it.
		   	 */
		  
		   	//prints true 
	       String st1 = "beginnersbook";    
	       String st2 = new String("beginnersbook").intern(); 
	      System.out.println("str1==str2: "+(str1==str2));
	   	
	     
	      ///Join
	      /**
	       * The first argument of this method specifies the delimiter that is used to join multiple strings.
			Note that if an element is null, then “null” is added.
	       */
	      String str=String.join("^","You","are","Awesome");  
	      System.out.println(str); // You^are^Awesome
	      System.out.println(String.join("-","This","is","proagm"));
	   	
	      //Now using this with collection objects.
		/*
		 * String[] arr= {"han","abc","ghj"}; ArrayList<String> al= (ArrayList<String>)
		 * Arrays.asList(arr);
		 * 
		 * System.out.println(String.join("£",al));
		 */
	      
	      
	      
	      //lentgh of the string  String st1 = "beginnersbook";   
	      
	      System.out.println(str1.length());  
	      
	      
	     //substring  String st1 = "beginnersbook";    
	      System.out.println(str1.substring(3));
	      System.out.println(str1.substring(4,9));
	      
	      
	     //split operator
	      /*
	       * Java String split method is used for splitting a String into its substrings,    *  based on the given delimiter or regular expression.
	       * String: chaitanya@singh Regular Expression: @  Output : {"chaitanya", "singh"}
	       */
	      String ss = new String("28/12/2013");
	      
	      String[] arrss= ss.split("/");
	      
	      for (String s1: arrss)
	      System.out.println(s1); //28       12 	      2013   
	      
	     	      
	      /*
	       * For e.g. split("anydelimiter", 3) would return the array of only 3 strings even if the delimiter
	       *  is present in the string more than 3 times.
	       */
	      String ss1 = new String("28/12/2013/4567/890/345/789");
	      String[] arrss1= ss1.split("/",4);
	      
	      for (String s1: arrss1)
	      System.out.println(s1); //o/p  28  ,	      12,	      2013,	      4567/890/345/789
	      
	       /*
	       * replace 
	       */
	      String ss2="big black nose big black eyes";
	      System.out.println(ss1.replace("/","$"));  //28$12$2013$4567$890$345$789
	      System.out.println(ss2.replace("big","small")); //  small black nose small black eyes
	      
	      
	      /*
	       * toLowerCase, toUpperCase
	       */
	     String ss3="WELCOME";
	       
	    System.out.println(ss2.toUpperCase());  //BIG BLACK NOSE BIG BLACK EYES
	    System.out.println(ss3.toLowerCase()); //   welcome
	    
	    
	    char[] ch =ss3.toCharArray();
	    //toString, converting charcater arry to string 
	    System.out.println("The character array is " + ch);  //BIG BLACK NOSE BIG BLACK EYES
	    String chstr= ch.toString();
	    System.out.println(chstr);
	    
	    /*
	     * trim to remove the spaces
	     */
	    String ss4="  WELCOME   ";
	    System.out.println("Trim to remove teh spaces " + ss4);
	    
	    
	    /*
	     * converting byte, int , float, char , char array to string  valueOf
	     * ss4="  WELCOME   ";
	     */
	      int a=10;
	      String sa=String.valueOf(a);
	      System.out.println("valueOF " +ss4+sa);//  WELCOME   10
	      
	      		
	//	System.out.println(s.charAt(1));
	//.out.println(s.charAt(1));
		
	}

}
