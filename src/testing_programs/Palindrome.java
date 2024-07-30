package testing_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("enter any String");
		String str=a.next();
		char[] c=str.toCharArray();
		String reverse="";
		for(int i=c.length-1;i>=0;i--)
		{
			reverse=reverse+c[i];
			
		}
		System.out.println("reverse of original strng is:"+reverse);
		if( str.equals(reverse))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("not palindrom");
		}
		
	}

}
