package testing_programs;

import java.util.Scanner;

public class SwitchProgram {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
int a=sc.nextInt();
String dayOfWeek = null;

switch(a) {
case 1:
	dayOfWeek="monday";
	break;
case 2:
	dayOfWeek="tuesday";
	break;
case 3:
	dayOfWeek="wednusday";
	break;
case 4:
	dayOfWeek="thursday";
	break;
case 5:
	dayOfWeek="friday";
	break;
case 6:
	dayOfWeek="saturday";
	break;
case 7:
	dayOfWeek="sunday";
	break;
	//System.out.println("today is:"+ dayOfWeek);


	

	}
            System.out.println("today is:"+dayOfWeek);
            


}
}
