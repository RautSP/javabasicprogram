package array_program;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		int[] a= {1,2,4,6,7,8};
		int start=0;
		int temp=0;
		int last=a.length-1;
		
		while(start<last)
		{
		temp=a[start];
		a[start]=a[last];
		a[last]=temp;
			start++;
			last--;
		}
		System.out.println(Arrays.toString(a));
	
		

}
}

