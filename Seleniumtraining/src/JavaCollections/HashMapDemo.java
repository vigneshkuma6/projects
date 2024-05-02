package JavaCollections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "java");
		hm.put(1, "java");
		hm.put(2, "python");
		hm.put(3, "API");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm);
	}

}
