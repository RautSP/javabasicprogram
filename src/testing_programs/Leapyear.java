package testing_programs;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter any year");
     int i= sc.nextInt();
     boolean isLeapYear=false;
     
     if(i%4==0)
     {
    	 if(i%100==0)
    	 {
    		 if(i%400==0)
    		 {
        		 isLeapYear=true;

    		 }
    		 else
    		 {
        		 isLeapYear=false;

    		 }
    	 }
    	 else 
    	 {
    		 isLeapYear=true;
    	 }
    	 

      }
       else
       {
    	  isLeapYear=false; 
       }
     if(isLeapYear==true)
     {
    	 System.out.println("given year is leap year");
     }
     else
     {
    	 System.out.println("not leap year");
     }
	}
}
