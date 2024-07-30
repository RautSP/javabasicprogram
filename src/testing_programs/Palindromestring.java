package testing_programs;

public class Palindromestring {

	public static void main(String[] args) {
      String OrinalWorld="nitin";
      String reverse="";
      char c[]=OrinalWorld.toCharArray();
      for(int i=c.length-1;i>=0;i--)
      {
    	  reverse=reverse+c[i];
      }
      System.out.println(reverse);
      if(reverse.equals(OrinalWorld))
      {
    	  System.out.println("String is palindrome");
      }
      else
      {
    	  System.out.println("not palindrome");
      }
	}

}
