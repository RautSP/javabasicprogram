package testing_programs;

import java.util.Arrays;

public class AppendZero {

	public static void main(String[] args) {
		int[]a= {1,2,0,3,0,4,0,5,0};
		
		int temp[]=new int[a.length];
		System.out.println(Arrays.toString(temp));
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(temp[i]+" "); 
		}
		System.out.println();
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				temp[count]=a[i];
				count++;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(temp[i]+" "); 
		}
	}

}
