package stringprogram;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is a programming language";
		String empty="";
		for(int i=s.length()-1;i>=0;i--)
		{
		char ch=s.charAt(i);
		empty=empty+ch;
	}
		System.out.println(empty);
	}
}
