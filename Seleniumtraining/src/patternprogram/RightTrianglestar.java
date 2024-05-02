package patternprogram;

public class RightTrianglestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=6;
//loop to iterate through row
for(int i=1;i<rows;i++)
{
	//loop to iterate through column
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
