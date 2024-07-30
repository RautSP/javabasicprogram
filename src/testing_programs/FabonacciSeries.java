package testing_programs;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
        int a=1;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int fab=0;

       while(fab<num)//0
       {
    	   fab=a+b;//2,3
    	   if(fab>num)
    	   {
    		break;   
    	   }
    	   System.out.print(fab+" ");
    	   a=b;//b=1,
    	   b=fab;//fab=3
       }

	}

}
