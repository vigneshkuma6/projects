package javapractice;

public class MatchingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { 'a', 'v', 'e', 'a', 'g', 'e', 'i' };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
