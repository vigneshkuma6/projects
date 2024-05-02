package stringprogram;

public class ReverseAlternateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is a programming language";
		System.out.println(reverseString(s));
	}
public static String reverseString(String s)
{
	String [] words=s.split(" ");
	String result="";
	int count=0;
	for(String word:words)
	{
		if(count%2==1)
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				result=result+word.charAt(i);
			}
			result=result+" ";
			
		}
		else
		{
			result=result+word+" ";
		}
		count++;
	}
	return result;
}
}
