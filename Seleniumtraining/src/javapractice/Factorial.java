package javapractice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of 24 is "+fact);
		String s=String.valueOf(fact);
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='4')
			{
				System.out.println(" 4 occurs at index "+i);
			}
		}
	}

}
