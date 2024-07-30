package testing_programs;

public class ReverseNumber {

	public static void main(String[] args) {
     int a=123456;
     int reverse=0;
     int reminder=0;
     
     while(a>0)
     {
    	reminder=a%10;
    	reverse=reverse*10+reminder;
    	System.out.println(reverse);
    	a=a/10;
    	 
     }
	}

}
