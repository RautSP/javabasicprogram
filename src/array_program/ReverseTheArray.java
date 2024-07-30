package array_program;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {2,3,4,1,9,8};
        int start=0;
        int temp;
        int last=ar.length-1;
        while(start<last)
        {
        	temp=ar[start];
        	ar[start]=ar[last];
        	ar[last]=temp;
        	start++;
        	last--;
        }
        System.out.println(Arrays.toString(ar));
        
	}

}
