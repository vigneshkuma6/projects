package javapractice;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int j=2*(n-i);j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
