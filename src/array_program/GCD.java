package array_program;

import java.util.Scanner;

public class GCD {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int fnumber=sc.nextInt();
		System.out.println("enter second number");
		int snumber=sc.nextInt();
		int GCD=0;
		for(int i=1;i<=fnumber && i<=snumber; i++)
		{
			if(fnumber%i==0 && snumber%i==0)
			{
				GCD=i;
			}
		
		
		}
		System.out.println(+GCD);
	}

}
