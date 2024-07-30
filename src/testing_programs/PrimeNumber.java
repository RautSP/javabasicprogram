package testing_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter any number");
     int a=sc.nextInt();
     sc.close();
     
     for(int i=2;i<a;i++)
     {
    	 if(a%i==0) {
    		 System.out.println(+a+"is not prime number");
    		 break;
    	 }
    	 
    	
    	
     } 
     System.out.println("it is prime number");
	}

}
