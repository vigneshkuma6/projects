package javapractice;

import java.util.Scanner;

public class Occurenceofparticularstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "differnces";
		int count = 0;
		char ele = 'e';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ele) {
				count = count + 1;
			}
		}

		System.out.println("the count of" + ele + "is" + count);

	}

}
