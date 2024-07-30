package testing_programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul=1;
     Scanner sc=new Scanner (System.in);
     System.out.println("enter any number");
     int num=sc.nextInt();
   /*  while(num>=1)
     {
    	 mul=mul*num;
    	 System.out.println(mul);
    	 num--;
     }*/
     for(int i=num;num>=1;num--)
     {
    	 mul=mul*num;
    	 System.out.println(mul);
     }
	}

}
