package testing_programs;

import java.util.HashMap;
import java.util.Map;

public class DulicatecharWithnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rajnandini pandurang raut";
		Map<Character,Integer>m=new HashMap<Character,Integer>();//
		char[]ch=str.toCharArray();
		for(Character c:ch)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
				
			
		}
		for(Character c:m.keySet())
		{
			if(m.get(c)>1)
			//System.out.println("Character"+" "+c+" "+" is repeated"+" "+m.get(c)+"timea");
			{
		System.out.println("Character"+" "+c+" "+" is repeated"+" "+m.get(c)+"timea");
			}
		}
	}

}
