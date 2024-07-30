package testing_programs;

import java.util.Scanner;

public class PrintNumberOfLettrsDigitSpacesInStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any english statement");
		String str=sc.nextLine(); 
        int capCount=0;
        int smallCount=0;
        int symbolCount=0; 
        
        
       char[] c=str.toCharArray();
       for(Character ch:c)
       {
    	   if(Character.isUpperCase(ch))
    	   {
    		   capCount++;
    	   }
    	   else if(Character .isLowerCase(ch))
    	   {
    		   smallCount++;
    	   }
    	   else 
    	   {
    		   symbolCount++;
    	   }
       }
       System.out.println("no. of letters is:"+capCount);
       System.out.println("no. of digits is:"+smallCount);
       System.out.println("no. of Spaces is:"+symbolCount);


	}

}
