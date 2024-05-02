package javapractice;

public class RemoveDuplicateString {

	public static String remove(String s) {
		String empty = " ";
		for (int i = 0; i < s.length(); i++) {
			if (!empty.contains(String.valueOf(s.charAt(i)))) {
				empty += s.charAt(i);
			}
		}
		
		return empty;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabccc";
		System.out.println(remove(str));

	}
}
