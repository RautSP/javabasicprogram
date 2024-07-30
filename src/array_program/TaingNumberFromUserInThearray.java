package array_program;

import java.util.Arrays;
import java.util.Scanner;

public class TaingNumberFromUserInThearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the arrey");
		int size=sc.nextInt();
		int[]ar=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter number:");
		   ar[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
	}
	

}
