package javapractice;

public class ChangeAlternateTocaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			char ch=c[i];
			if(i%2==0)
			{
				System.out.print(Character.toLowerCase(ch));
			}
			else
			{
				System.out.print(Character.toUpperCase(ch));
			}
		}
	}

}
