package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is a widely used programming language";
		
		str = str.replaceAll("\\s", "");
		char ch[] = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet())
			if (entry.getValue() > 1) {
				System.out.println(" characters " + entry.getKey() + " occures " + entry.getValue() + " times");
				// System.out.println(entry.getKey());
			}

	}

}
