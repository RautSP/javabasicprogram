package array_program;

import java.util.Scanner;

public class FactorOfTheGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
	    int a=sc.nextInt();
	    sc.close();
	    for(int i=1;i<=a;i++)
	    {
	    	if(a%i==0)
	    	{
	    		System.out.println(i);
	    	}
	    	
	    }

	}

}
