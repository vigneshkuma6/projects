package javapractice;

import java.util.Arrays;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is vignesh";
		str=str.toLowerCase();
		str= str.replaceAll(" ", "");
		char[]c=str.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
	}

}
