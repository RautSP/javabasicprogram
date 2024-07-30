package testing_programs;

import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter second number");
    int b=sc.nextInt();
    sc.close();
    int quotient=0;
    int reminder=0;
    System.out.println("quotient of two number is="+a/b);
    System.out.println("reminder of two number is="+a%b);

	}

}
