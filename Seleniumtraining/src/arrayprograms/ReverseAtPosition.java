package arrayprograms;

public class ReverseAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8,9};
reverse(a,0,4);
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]);
}

	}
	
	public static void reverse(int a[],int start,int end)
	{
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}

}
