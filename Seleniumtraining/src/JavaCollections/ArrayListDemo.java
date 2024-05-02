package JavaCollections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a =new ArrayList<String>();
		a.add("java");
		a.add("selenium");
		System.out.println(a);
		a.add(0, "python");
		System.out.println(a);
	}

}
