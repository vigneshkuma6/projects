package stringprogram;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="radar";
		String empty="";
		for(int i=s.length()-1;i>=0;i--)
		{
			empty=empty+s.charAt(i);
		}
if(s.equalsIgnoreCase(empty))
{
	System.out.println("String are palindrome");
}
else
{
	System.out.println("String are not palindrome");
}
	}

}
