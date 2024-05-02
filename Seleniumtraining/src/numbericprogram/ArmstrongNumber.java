package numbericprogram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=153;
int sum=0;
while(n>0)
{
	int rem=n%10;
	sum=sum+(rem*rem*rem);
	n=n/10;
}

if(sum==n)
{
	System.out.println(n+" is a armstrong number" );
}
else
{
	System.out.println(n+" is not a armstrong number" );
}
	}

}
