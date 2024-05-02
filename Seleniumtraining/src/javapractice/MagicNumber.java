package javapractice;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1081;
		int sum = 0;
		int n = number;

		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			} else {
				sum = sum + n % 10;
				n = n / 10;
			}
		}
		if (sum == 1) {
			System.out.println(number + " is Magic number");
		} else {
			System.out.println(number + " is not a Magic number");
		}
	}

}
