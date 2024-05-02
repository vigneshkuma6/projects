package javapractice;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualstr = "java is a widely used programming language";
		System.out.println("The reversed string is " + reverseWord(actualstr));
	}

	public static String reverseWord(String str) {
		System.out.println(str);
		String s[] = str.split(" ");
		System.out.println();
		String reverseString = "";

		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			String reverseword = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseword = reverseword + word.charAt(j);

			}

			reverseString = reverseString + reverseword + " ";
		}
		return reverseString;

	}

}
