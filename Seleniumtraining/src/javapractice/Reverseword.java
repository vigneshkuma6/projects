package javapractice;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actualstr = "java is a widely used programming language";
		String str[] = actualstr.split(" ");
		String res = "";
		for (String s : str) {
			String nstr = "";
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				nstr = c + nstr;
			}
			res = res + nstr + " ";
		}
		System.out.println(res);
	}

}
