package javapractice;

public class ReverseAlternateString {

	public static void main(String a[]) {

		String actualstr = "java is a widely used programming language";
		System.out.println("The reversed string is:" + rev(actualstr));
	}

	public static String rev(String a) {
		String res = " ";
		String ary[] = a.split(" ");

		int count = 0;

		for (String exp : ary) {

			if (count % 2 == 1) {
				char chars[] = exp.toCharArray();
				for (int i = exp.length() - 1; i >= 0; i--) {
					char ch = chars[i];
					res = res + ch;

				}
				
				res = res + " ";
			} else {
				res = res + exp + " ";
			}
			count++;
		}

	
		return res;
	}
}
