package javapractice;

public class CountofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello";
int count=0;
char[]c=str.toCharArray();
for(char ch: c)
{
	count++;
}
System.out.println(count);
	}

}
