package JavaCollections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hs = new HashSet<String>();
		hs.add("selenium");
		hs.add("java");
		hs.add("python");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		hs.remove("python");
		System.out.println(hs);
	}

}
