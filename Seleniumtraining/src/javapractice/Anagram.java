package javapractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Mother In Law";
		String s2 = "Hitler Woman";
		boolean status;
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		if(s1.length()!=s2.length())
		{
			System.out.println("the strings are not anagram");
		}
		char s[] = s1.toCharArray();
		char c[] = s2.toCharArray();
		Arrays.sort(s);
		Arrays.sort(c);
		status = Arrays.equals(s, c);
		if (status == true) {
			System.out.println("the strings are anagram");
		} else {
			System.out.println("the strings are not anagram");
		}

	}

}
