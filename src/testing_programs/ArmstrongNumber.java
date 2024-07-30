package testing_programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the number should be same from begining and lasting for eg.12321

		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int originalnum=num;
		int cube=0;
	    int reminder=0;
		while(num>0)
		{
			reminder=num%10;
			cube=cube+(reminder*reminder*reminder);
			
			num=num/10;
		}
		System.out.print(cube);
		if(originalnum==cube)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		
		
	}

}
