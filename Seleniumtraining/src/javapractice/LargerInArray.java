package javapractice;

public class LargerInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 43, 65, 87, 777 };
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("The largest numbet is " + largest);
	}

}
