package array_program;

public class ToFindMinandMaxElement {

	public static void main(String[] args) {
		int [] a= {4,5,9,12,13,15,33,4,1};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				min=a[i];//5,//4,\\1
			}
				
			if(max<a[i])
			{
				max=a[i];//9,12,13,15,33
			}
		}
		System.out.println("maximum valueis="+max);
		
		System.out.println("minimum value is="+min);

	}

}
