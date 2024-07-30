package array_program;

import java.util.Arrays;

public class RightRotateAnElementByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,9,3,4,5};
		int n=3;
		int size=a.length;
		System.out.println(size);
		for(int j=1;j<=n;j++)
		{
			int last=a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=last;

		}
System.out.println(Arrays.toString(a));
	}
}
