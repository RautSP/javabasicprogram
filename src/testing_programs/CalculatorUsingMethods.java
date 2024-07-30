package testing_programs;

import java.util.Scanner;

public class CalculatorUsingMethods {
	public static int sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is:"+sum);
		return sum;
	}
	public static void multiplication(int a,int b)
	{
		int multiplication=a*b;
		System.out.println("multiplication is:"+multiplication);
	}
	public static void substraction(int a,int b)
	{
		int substraction=a-b;
		System.out.println("substraction is:"+substraction);
	}
	public static void division(int a,int b)
	{
		int division=a/b;
		System.out.println("division is:"+division);
	}
	public static void reminder(int a,int b)
	{
		int rem=a%b;
		System.out.println("reminder is:"+rem);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(5,7);
		multiplication(5,7);
		substraction(8,5);
		division(35,7);
		reminder(35,7);
		

	}

	
		
	

}
