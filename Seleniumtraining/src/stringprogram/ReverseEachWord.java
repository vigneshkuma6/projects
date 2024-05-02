package stringprogram;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is a programming language";
		System.out.println(reverseWord(s));
	}
	
	public static String reverseWord(String s) 
	{
		String [] words=s.split(" ");
		String reverse="";
		for(String word:words)
		{
			String empty="";
			for(int i=word.length()-1;i>=0;i--)
			{
				
				empty=empty+word.charAt(i);
			}
			reverse=reverse+" "+empty;
		}
		return reverse;
	}

}
