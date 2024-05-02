package stringprogram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="race";
		String s2="care";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			char []c1=s1.toCharArray();
			char []c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
		boolean result=	Arrays.equals(c1, c2);
		if(result==true)
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		}

	}

}
