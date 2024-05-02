package javapractice;

public class ReverseaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = { 'a', 'b', 'c', 'd', 'e' };

		int right = s.length - 1;
		int left = 0;
		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left += 1;
			right -= 1;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}
	}
}
