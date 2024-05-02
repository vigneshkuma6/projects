package patternprogram;

public class invertPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=6;
for(int i=rows;i>=0;i--)
{
	for(int j=1;j<=rows-i;j++)
		
	{
		System.out.print(" ");
	}
	for(int k=1;k<=2*i-1;k++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
