package javapractice;

public class PrimeNumber {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int temp=0;
		int m=0;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+" is not a prime number");
		}
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				temp=1;
				break;
			}
		}
		if(temp==0)
		{
			System.out.println(n+" is a prime number");
		}
	}
	
}
