package testing_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharecterAlongWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any english statement");
		String str=sc.next();
		//sc.close();
		char[] ch=str.toCharArray();//[j,a,v,a]
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();//j=1,v=1,a=1
		
		for(Character c:ch)//j
			
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c,1);//j,1//a,1//v,1//
			}
			
		}
		for(Character c:m.keySet())
		{
			if(m.get(c)>1)
			{
				System.out.println("character "+"  " +c+" " +"is repeated" +" "+m.get(c)+" " +"times");
			}
		}
		
		

	}

}
