package javapractice;

public class reverseAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {1,2,3,4,5,6,7};
 reverseArray(a,0,4);
 printarray(a);
	}
public static void reverseArray(int[] a,int start,int end)
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
public static void printarray(int a[])
{
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
}
}