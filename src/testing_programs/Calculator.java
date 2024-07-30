package testing_programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number");
     int a=sc.nextInt();
     System.out.println("enter second number");
     int b=sc.nextInt();
     System.out.println("enter any operator +,-,*,/,%");
     char operator=sc.next().charAt(0);
     sc.close();
     switch(operator)
     {
     case '+':
     System.out.println("sum of two number is:" +a+b);
     break;
     case '*':
         System.out.println("mul of two number is:" +a*b);
         break;
     case '-':
         System.out.println("min of two number is:" +(a-b));
         break;
     case '/':
         System.out.println("div of two number is:" +a/b);
         break;
     case '%':
         System.out.println("mod of two number is:" +a%b);
         break;
      default:
    	  System.out.println("you enter default operator");
     }
	
	}

}
