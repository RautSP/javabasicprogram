package array_program;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,23,45,65,43,32};
		int max1=a[0];//10//23//45//65
		int max2=a[0];//10//10//23//45
		 for(int i=1;i<=a.length-1;i++)
		 {
			 if(max1<a[i])//10<23
			 {
				 max2=max1;//max2=10//23//45
				 max1=a[i];//max1=23//45//65
				 
			 }
			 else if(max1>max2)
			 {
		       //System.out.println(+max2);
			 }
		 }
		 System.out.println(+max2);

	}

}
