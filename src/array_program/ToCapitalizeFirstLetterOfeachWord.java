package array_program;

import java.util.Scanner;

public class ToCapitalizeFirstLetterOfeachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entr any statement");//shital surse
		String st=sc.nextLine();
		//String OriginalStatement="";
		String[] words=st.split(" ");//"shital" "surse"
		for(String word:words)//shital
		{
			char[] c=word.toCharArray();//s,h,i,t,a,l
			char ch=c[0];
			String firstchar=String.valueOf(ch).toUpperCase();//S
			for(int i=1;i<c.length;i++)
			{
				firstchar=firstchar+c[i];
			}
			System.out.println("OriginalStatement="+firstchar+" ");
		}
		
		

	}

}
