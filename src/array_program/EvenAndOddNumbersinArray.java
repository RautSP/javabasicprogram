package array_program;

public class EvenAndOddNumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {3,4,5,6,7,8,9,10};
		{
			for(int i=0;i<=a.length-1;i++)
			if(a[i]%2==0)
			{
				System.out.println("Even number:"+" "+a[i]);
			}
			else
			{
				System.out.println("Odd number:"+" "+a[i]);
			}
		}

	}

}
