package testing_programs;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int  a=sc.nextInt();
		int reverse=0;
		int reminder=0;
		
		
		while(a>0) {
		reminder=a%10;
		reverse=reverse*10+reminder;
		//System.out.println("reverse of original number is"+reverse);
		a=a/10;

		}
		System.out.println("reverse of original number is"+reverse);
				
		if(reverse==a)
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
