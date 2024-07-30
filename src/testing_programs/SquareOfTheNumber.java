package testing_programs;

import java.util.Scanner;

public class SquareOfTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int x=sc.nextInt();
		int initialnumber=x;//4
		//int square=0;
		System.out.println("enter power of number");
		int n=sc.nextInt();//2
		for(int i=1;i<n;i++)
		{
			 x=initialnumber*x;
		
			//System.out.println("square of the given number is:"+square);
		
		}
		System.out.println("square of the given number is:"+x);
		

	}

}
