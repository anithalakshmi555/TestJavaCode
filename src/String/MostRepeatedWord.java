package String;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MostRepeatedWord {

	public MostRepeatedWord() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		int i=0,j=0,c=0,max=0,index=0;
		String line, str[],word="";
		ArrayList<String> al = new ArrayList<String>();
		
		FileReader fr= new FileReader("C:\\Users\\Miss Jaydevappa\\eclipse-workspace\\Testjava\\src\\String\\data.txt");
		BufferedReader br = new BufferedReader(fr);
		

		while((line = br.readLine()) != null) {
			str=line.split("[.,\\s]+");
			for(String st:str) {
			System.out.println(st);
			al.add(st);} }
			
			for (i=0;i<al.size();i++) {
				c=1;
				for(j=i+1;j<al.size();j++) {
					if(al.get(i).equals(al.get(j))) {
						c++;
					}
					
				}
				if(max<c) {
					max=c;
					word=al.get(i);
				}
			}
			  System.out.println("Most repeated word: " + word);  
			  System.out.println("Total number of the words in the file is  " + al.size());  
	System.out.println(" the max count of the word is   pos is "  +  max +"---------" + word);	
	
	}
			
	}