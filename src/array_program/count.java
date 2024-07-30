package array_program;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="welCome";
		int capcount=0;
		int smallcount=0;
		char[] c=st.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]>'A' &&c[i]<'Z')
			{
				capcount++;
			}
			
			
		}
		System.out.println("smallest="+smallcount);
		System.out.println("largest="+capcount);
		

	}

}
