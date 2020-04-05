package String;

public class length {

	public length() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String s = "GreenGrassGn";
		System.out.println(s.length());
		int i,j;
		int n=s.length();
		int fre[]  = new int[n];
		char[] ch = s.toCharArray();
		String s1="Big black nose Big black nose";
		String words[]= s1.split(" ");
		System.out.println(words.length);
		for(i=0;i<words.length;i++)
		{
			
			
		
				for(j=i+1;j<6;j++)
				{
					if ((words[i].equals(words[j])) && words[i]!="0") {
					{
						
						
						System.out.println(words[i]);
						words[j]="0";
					}
				}
				
			}
		}
		
		System.out.println(ch.length);
		
				for(i=0;i<n;i++)
				{
					int c=1;
					for(j=i+1;j<n;j++)
					{
						if(ch[i]==ch[j] && ch[i]!=' ' && ch[i]!='0')
						{
							c=c+1;
							ch[j]='0';
						}
					}
					if(ch[i]!='0') {
						fre[i]=c;
				}
			 }

				for (i=0;i<fre.length;i++)
				{
					if(ch[i]!='0') {
						System.out.println(ch[i] + "   " +fre[i]);
					}
						
				}
				int min = fre[0]; int max=fre[0];
				char minch=ch[0]; char maxch=ch[0];
				
				for (i=0;i<fre.length;i++)
				{
					if(ch[i]!='0' && min> fre[i]) {
						min=fre[i];
						minch=ch[i];
					}
					if(ch[i]!='0' && max<fre[i]) {
						max=fre[i];
						maxch=ch[i];
					}
						
				}
				System.out.println(min + "   " +minch);
				System.out.println(max + "   " +maxch);
				
				String s2="Alive is awesome";
				String s3 =s2.replaceAll("[a-z&&[alwsr]]+","");
				System.out.println(s3);
				String s4 =s2.replaceAll("[alwsr]+","");
				System.out.println(s4);
}

}
