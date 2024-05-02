package stringprogram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateUsingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello good morning";
		s=s.replaceAll("\\s", "");
		char chars[]=s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c:chars)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		for(Entry<Character, Integer> ch:hm.entrySet())
		{
			if(ch.getValue()>1)
			{
				System.out.println(ch.getKey());
			}
		}

	}

}
