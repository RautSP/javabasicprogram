package testing_programs;

import java.util.Scanner;

public class SumOfallInputtedDigits {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any number");
       int a=sc.nextInt();
       int sum=0;
       while(a>0)
       {
    	   int reminder=a%10;//given no.345%10=5,34%10=4
    	   sum=sum+reminder;//5
    	   //System.out.println(sum);
    	   a/=10;//34
       }
	   System.out.println(sum);

	}

}
