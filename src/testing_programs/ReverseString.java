package testing_programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any String");
       String sr=sc.next();
       char[] c=sr.toCharArray();
       String reverse="";
       for(int i=c.length-1;i>=0;i--)
       {
    	   reverse=reverse+c[i];
       }
       System.out.println("reverse of string is:"+reverse);

}
}
