package javapractice;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="anitha";
String s2="nithya";
//char str[]=s1.toCharArray();
//char str1[]=s2.toCharArray();
for(int i=0;i<s1.length();i++)
{
	char c=s1.charAt(i);
	if(s2.contains(String.valueOf(c)));
	{
		System.out.println(c);
	}
	
}
	}

}
