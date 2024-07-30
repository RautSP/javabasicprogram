package array_program;

public class SmallestNum {

	public static void main(String[] args) {
		int a[]= {44,55,34,76,23,12};
		int small=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
			//System.out.println("smallest number in the given arrey is="+small);
		}
		System.out.println("smallest number in the given arrey is="+small);

		
	}

}
