package testing_programs;

import java.util.Scanner;

public class TeenagerProgram {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter any number");
     int a=sc.nextInt();
     
     if(a<=13)
     {
    	 System.out.println("this is child");
     }
     else if(a>13&&a<=19)
     {
    	 System.out.println("this is tennager");
    	 
     }
     else 
     {
    	 System.out.println("this is adult");
     }
    
	}

}
