package testing_programs;

import java.util.Scanner;

public class Average_Of_ThreeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		System.out.println("average of three numbers is=" +(a+b+c)/3 );
		

	}

}
