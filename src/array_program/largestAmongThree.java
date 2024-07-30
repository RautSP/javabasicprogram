package array_program;

import java.util.Scanner;

public class largestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int a=sc.nextInt();
		System.out.println("enter 2nd value");
		int b=sc.nextInt();
		System.out.println("enter 3rd value");
		int c=sc.nextInt();
		
		
		if(a>b &&a>c)
		{
			System.out.println(" a is largest among three");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largset among three");
		}
		else 
		{
			System.out.println("c is largest among three");
		}

	}

}
