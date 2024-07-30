package testing_programs;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first munber");
    int x=sc.nextInt();//25
    int initialnumber=x;//5;
    System.out.println("enter second number");
    int n=sc.nextInt();
    for(int i=1;i<n;i++)
    {
    	 x=initialnumber*x;//125
    	System.out.println(x);
    }
	}

}
