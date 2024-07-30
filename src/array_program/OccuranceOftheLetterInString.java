package array_program;

public class OccuranceOftheLetterInString {

	public static void main(String[] args) {
     String str="my java class";
     int before=str.length();
     System.out.println(before);
     String str2=str.replace("s","");
     int after=str2.length();
     System.out.println("number of occurances of gven character is="+(before-after));
	}
     
    /* char[] c=str.toCharArray();
     int count=0;
     for(int i=0;i<=c.length-1;i++)
    	 if('a'==c[i])
    	 {
    		 count++;
    	 }
     System.out.println("number of occurance of the given character is="+count);
	}*/

}
