package numbericprogram;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=121;
int originaln=n;
int sum=0;
while(n!=0)
{
	int rem=n%10;
	sum=(sum*10)+rem;
	n=n/10;
}
System.out.println(sum);
if(originaln==sum)
{
	System.out.println(originaln+" is a plaindrome");
}
else
{
	System.out.println(originaln+" is not a plaindrome");
}

	}

}
