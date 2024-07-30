package array_program;

public class CompareTwoElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4};
		int[] b= {1,2,3,5};
		boolean comparisonstatus=true;
		if(a.length==b.length)
		{
			System.out.println("array are same in size");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
					
			    {
				  comparisonstatus=false;
				  break;
			    }
				
			}
			
		}
		else
		{
			comparisonstatus=false;
		}
		if(comparisonstatus)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}
	
}
