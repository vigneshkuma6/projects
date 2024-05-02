package javapractice;

public class printwithoutindexing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="java programming";
String str[]=s.split(" ");
for(String c:str)
{
	if(c.contains("java"))
	{
		System.out.println(c);
	}
}
	}

}
