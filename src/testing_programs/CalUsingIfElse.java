package testing_programs;

import java.util.Scanner;

public class CalUsingIfElse {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter first number");
	     int a=sc.nextInt();
	     System.out.println("enter second number");
	     int b=sc.nextInt();
	     System.out.println("enter any operator +,-,*,/,%");
	     char operator=sc.next().charAt(0);
	     sc.close();
	     if(operator=='+') {
	    	 System.out.println("sum of two number is:" +a+b);
	     
	     }
	     else if(operator=='-')
	     {
	    	 System.out.println("sum of two number is:" +(a-b));
		     
	     }
	     else if(operator=='*')
	     {
	    	 System.out.println("sum of two number is:" +a*b);
		     
	     }
	     else if(operator=='/')
	     {
	    	 System.out.println("sum of two number is:" +a/b);
		     
	     }
	     else if(operator=='%')
	     {
	    	 System.out.println("sum of two number is:" +a%b);
		     
	     }
	     else
	     {
	    	 System.out.println("you enter default operator");
	     }
	}

}
