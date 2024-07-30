package testing_programs;

import java.util.Scanner;

public class AddNnaturalNoUsingScanner {

	public static void main(String[] args) {
		//int i=0;
		int sum=0;
     Scanner sc=new Scanner(System.in);
    System.out.println("enter any natural number for addition");
    int num=sc.nextInt();
    /*while(i<=num)
    {
    	sum=sum+i;
    	i++;
    	System.out.println(sum);
    }*/
    for(int i=0;i<=num;i++)
    {
    	sum=sum+i;
    	System.out.println(sum);

    }
	}

}
