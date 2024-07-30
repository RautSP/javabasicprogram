package array_program;

import java.util.Arrays;

public class AppendZero {

	public static void main(String[] args) {
		int[]a= {1,0,2,0,3,0,4,0,5,0};
		int []temp=new int [a.length];
		System.out.print(Arrays.toString(temp));
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]!=0)
			{
				temp[count]=a[i];
				count++;
			}
		}
		System.out.println();
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(temp[i]+ " ");
		}
	
	}

}
