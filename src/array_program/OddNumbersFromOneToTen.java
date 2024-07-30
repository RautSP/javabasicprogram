package array_program;

public class OddNumbersFromOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("even numbers between one to ten is="+i);
			}
			//System.out.println("even numbers between one to ten is+"+i);
		}
		
		
		for(int j=0;j<=10;j++)
		{
			if(j%2!=0)
			{
				System.out.println("odd numbers from one to ten is="+j);
			}
			//System.out.println("odd numbers from one to ten is+"+j);
			
		
		}
		
	}

}
