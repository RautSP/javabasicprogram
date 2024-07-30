package array_program;

import java.util.Scanner;

public class SearchTheGivenElementInArrey {

	public static void main(String[] args) {
		int [] a= {8,5,9,12,13,15,33,4,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number that you wnat to found");
		int b=sc.nextInt();
		sc.close();
		boolean found=false;
		for(int i=0;i<=a.length-1;i++)
		{
		if(b==a[i])
		{
			found=true;
			System.out.println("the given number is present in the arrey:"+i);
			break;
		}
		}
		if(!found)
		{
			System.out.println("the givem number is not present in the arrey");
		}
		

	}

}
