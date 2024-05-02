package javapractice;

public class Sumofnum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 2 };
		int sum = 7;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("count pair is" + arr[i] + "&" + arr[j]);
				}
			}
		}

	}

}
