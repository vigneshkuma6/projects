package javapractice;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is a widely used programming language";
		/*String actual= str.replaceAll("\\s", "");
		System.out.println(actual);*/
	char c[]=str.toCharArray();
	String actual="";
	for(int i=0;i<str.length();i++)
	{
		if ( (c[i] != ' ') && (c[i] != '\t') )
		{
			actual=actual+c[i];
		}
	}
	System.out.println(actual);
	}

}
