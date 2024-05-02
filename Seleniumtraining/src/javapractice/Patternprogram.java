package javapractice;

public class Patternprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int j;
		for(int i=0;i<n;i++)
		{
			for(j=n-1;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
