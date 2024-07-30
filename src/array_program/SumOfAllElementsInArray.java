package array_program;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {3,2,5,8,6,7,9};
		//System.out.println(a.length);
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);

	}

}
