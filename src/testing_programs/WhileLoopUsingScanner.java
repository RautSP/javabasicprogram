package testing_programs;

import java.util.Scanner;

public class WhileLoopUsingScanner {

	public static void main(String[] args) {
		int i=0;
		
    Scanner sc=new Scanner(System.in);
    System.out.println("how many times you want print String");
    
    int num=sc.nextInt();
    sc.close();
    while(i<num)
    {
    	System.out.println("hello world");
    	i++;
    }
	}

}
