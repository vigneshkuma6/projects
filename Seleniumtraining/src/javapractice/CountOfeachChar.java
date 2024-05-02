package javapractice;
// Program to count occurence of each character in a sentence
import java.util.HashMap;
import java.util.Map;

public class CountOfeachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Aana eats her own apple";
		String w=s.replaceAll(" ", "");
		System.out.println(w);
		char str[]=w.toCharArray();
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		
		for(char ch:str)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
	System.out.println(hm);
	for(Map.Entry<Character, Integer>et:hm.entrySet())
	{
		System.out.println(et.getKey()+" occurs "+et.getValue()+ "Times");
	}
	
	}

}
