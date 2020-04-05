package String;

public class SmallestLargestWord {

	public SmallestLargestWord() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
	      String word = "", small = "", large="";    
	      String[] words = new String[100];    
	      int length = 0;    
	      
	      words=string.split(" ");
	      for(String s: words)
	    	  System.out.println(s);
	      
	      small=words[0];
	      large=words[0];
	      int i=0,sp=0,lp=0;
	      for(i=0;i<words.length;i++)
	      {
	    	  if(small.length()>words[i].length()) {
	    		  small=words[i];
	    		  sp=i;
	    	  }
	    	  if(large.length()<words[i].length()) {
	    		  large =words[i];
	    		  lp=i;
	    	  }	  
	      }

	      
	      System.out.println("the smallest words are    and   pos  " + small +"   "+ sp );
	      System.out.println("the smallest words are    and   pos   " + large  +"   "+ lp );
	}

}
