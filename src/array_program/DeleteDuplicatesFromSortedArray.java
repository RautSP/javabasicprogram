package array_program;

public class DeleteDuplicatesFromSortedArray {

	public static void main(String[] args) {
     int[] a= {3,4,4,5,5,5,6,7,9,10};
      
	 int j=0;
	 

	 for(int i=0;i<a.length-1;i++)
     {
    	 if(a[i]!=a[i+1])
    	 {
    		 a[j]=a[i];
    		 j++;
    		 System.out.print(+j +" ");
    	 }
    	// System.out.println("j="+j);
    	
     }
     
     a[j]=a[a.length-1];
     System.out.println(a[j]);
	for(int i=0;i<=j;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	}

}
