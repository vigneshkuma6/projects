package javapractice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rahulshettyacademy";
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		Set<Character> s = hm.keySet();
		System.out.println(s);
		for (char c : s) {
			if (hm.get(c) > 1) {
				System.out.println(c + "-->" + hm.get(c));
			}
		}
	}

}
