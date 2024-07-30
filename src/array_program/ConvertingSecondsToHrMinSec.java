package array_program;

import java.util.Scanner;

public class ConvertingSecondsToHrMinSec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter seconds:");
		int a=sc.nextInt();
		sc.close();
		int miniuts=a/60;
		int remainigsec=a%60;
		 
		int Hours=miniuts/60;
		int remainingmin=miniuts%60;
		
		System.out.println(+Hours+":"+remainingmin+":"+remainigsec);

	}

}
