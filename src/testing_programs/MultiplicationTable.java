package testing_programs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
     
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for multiplication table");
		int a=sc.nextInt();
		sc.close();
		for(int i=1;i<=10;i++)
		{
			//System.out.println("multiplication table for given number is:"+a*i);
			int multiplication=a*i;
			System.out.println(multiplication);
		}
	}

}
