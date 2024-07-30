package array_program;

import java.util.Scanner;

public class ToSeperateCapSmallSymbol {

	
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any text");
       String s=sc.nextLine();
      
       String caplettert = null;
       String smallletter = null;
       String symbol = null;
      
       
       
       char[]ch=s.toCharArray();
      for(char c:ch)  
      {
    	  if(c>='A'&&c<='Z')
    	  {
    		  caplettert+=c;
    		    
    	  }
    	  
    	  else if(c>='a'&&c<='z')
    	  {
    		  smallletter+=c;
    		 
    	  }
    	  else
    	  {
    		  symbol+=c;
    		 
    	  }
      
      }
	
      System.out.println(caplettert+" ");
      System.out.println(smallletter+" ");
      System.out.println(symbol );
	}
}

