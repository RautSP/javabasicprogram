package array_program;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int a=sc.nextInt();
		boolean IsPrime=true;
		
		if(a%2==0)
		{
			IsPrime=false;
		}
		else
		{
		  IsPrime=true;
		}
		
		if(IsPrime)
		{
			System.out.println("given number is prime");
	    }
		else
		{
			System.out.println("not prime");
		}

	}

}
