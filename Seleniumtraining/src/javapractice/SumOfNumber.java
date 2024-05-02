package javapractice;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=589;
		int rem=0;
		int sum=0;
		while(n>0)
		{
		rem=n%10;
		sum=rem+sum;
		n=n/10;
		
	}
		System.out.println(sum);
	}
}
