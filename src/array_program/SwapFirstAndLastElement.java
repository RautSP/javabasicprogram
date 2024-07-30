package array_program;

import java.util.Arrays;

public class SwapFirstAndLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,5};
		
		int temp=0;
		
			
			
			temp=a[0];
			a[0]=a[a.length-1];
			a[a.length-1]=temp;
		
		System.out.println(Arrays.toString(a));

	}

}
