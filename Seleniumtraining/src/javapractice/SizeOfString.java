package javapractice;

public class SizeOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Rahul Shetty Academy is the best";
String []words=str.split(" ");
String shortest=words[0];
String longest=words[0];
for(String word:words)
{
	if(word.length()<shortest.length())
	{
		shortest=word;
	}
	if(word.length()>longest.length())
	{
		longest=word;
	}
}

System.out.println("The shortest word is "+shortest);
System.out.println("The longest word is "+longest);
	}

}
