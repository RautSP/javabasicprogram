package array_program;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a=345;
		int count=0;
		while(a>0)
		{
			count++;
			a=a/10;
			System.out.println(count);
		}

	}

}
