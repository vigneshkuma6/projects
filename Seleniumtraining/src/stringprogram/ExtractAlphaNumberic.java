package stringprogram;

public class ExtractAlphaNumberic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="afdvhhh1239@#0jd";
		StringBuilder number=new StringBuilder();
		StringBuilder alpha=new StringBuilder();
		StringBuilder special=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				number.append(s.charAt(i));
			}
			else if(Character.isAlphabetic(s.charAt(i)))
			{
				alpha.append(s.charAt(i));
			}
			else
			{
				special.append(s.charAt(i));
			}
		}
		System.out.println(number);
		System.out.println(alpha);
		System.out.println(special);
	}

}
