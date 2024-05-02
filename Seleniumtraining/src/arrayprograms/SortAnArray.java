package arrayprograms;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,43,4,88,9,48,32,39};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for(int k=0;k<a.length;k++)
{
	System.out.print(a[k]+" ");
}
	}

}
