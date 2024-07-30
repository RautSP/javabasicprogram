package array_program;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("before swapping a="+a);
		System.out.println("before swapping b="+b);
		a=a+b;//30
        b=a-b;//30-20=10
        System.out.println("after swapping b="+b);
        a=a-b;
        System.out.println("after swapping a="+a);
	}

}
