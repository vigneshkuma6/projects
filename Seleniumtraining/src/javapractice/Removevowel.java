package javapractice;

public class Removevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vignesh";
		char c[]=s.toCharArray();
//		s=s.replaceAll("a", "*");
//		s=s.replaceAll("e", "*");
//		s=s.replaceAll("i", "*");
//	s=	s.replaceAll("o", "*");
//		s=s.replaceAll("u", "*");
		s=s.replaceAll("[aAeEiIoOuU]", "*");
		for(int i=0;i<c.length;i++)
		{
		
		if(c[i]=='a'|| c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| c[i]=='u')
		{
			c[i]='*';
		}
		
	
	}
		System.out.println(c);
//		System.out.println(s);
	}
}
