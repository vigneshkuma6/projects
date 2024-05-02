package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Add3dArrayInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		List<ArrayList<Integer>> a = new ArrayList<>();

		a1.add(1);
		a1.add(2);
		a1.add(3);

		a2.add(4);
		a2.add(5);
		a2.add(6);

		a3.add(7);
		a3.add(8);
		a3.add(9);

		a.add(a1);
		a.add(a2);
		a.add(a3);
		System.out.println(a);
		for (ArrayList al : a) {
			ArrayList<Integer> temp = al;
			for (Integer i : temp) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
