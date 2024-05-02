package stringprogram;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="java is a programing language";
s=s.replaceAll("\\s", "");
System.out.println(s);
int count =0;
int constants=0;
for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		count++;
	}
	else
	{
		constants++;
	}
}
System.out.println("The number of vovels are "+count);
System.out.println("The number of constants are "+constants);
	}

}
