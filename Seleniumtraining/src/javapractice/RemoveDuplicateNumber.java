package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 11, 12, 13, 13, 14, 15, 15, 16, 17, 17 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : a) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
