package javapractice;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd", nstr = "";
		char ch;

		System.out.println("Original string is " + str);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}

		System.out.println("Reversed  string is " + nstr);
	}

}
