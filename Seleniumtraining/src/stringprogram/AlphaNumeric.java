package stringprogram;

public class AlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="2a3b4c";
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)));
			{
				count=s.charAt(i)-'0';
			}
			if(i+1<s.length()&&!Character.isDigit(s.charAt(i+1)))
			{
				for(int j=0;j<count;j++)
				{
					sb.append(s.charAt(i+1));
				}
			}
			i++;
		}
		
System.out.println(sb);
	}

}
