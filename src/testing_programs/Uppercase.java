package testing_programs;

public class Uppercase {
	public static void main(String[] args)
	{
			String s="ASDLKMqwerASDwe@#$$%^^^&$";
	int capcount=0;
	int smallcount=0;
	int symbolcount=0;
	char c[]=s.toCharArray();
	for(char ch:c)
	{
		if(Character.isUpperCase(ch))
		{
			capcount++;
		}
		if(Character.isLowerCase(ch))
		{
			smallcount++;
		}
		else
		{
			symbolcount++;
		}
	}
	
}
}
