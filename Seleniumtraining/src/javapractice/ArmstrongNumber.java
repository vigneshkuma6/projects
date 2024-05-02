package javapractice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int temp=n;
		int rem = 0;
		int sum = 0;
		while (temp != 0) {

			rem = temp % 10;
			sum = (rem * rem * rem) + sum;
			
			temp = temp/ 10;
		}
		if(sum==n)
		{
			System.out.println("the number is armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

		

	}

}
