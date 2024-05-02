package javapractice;

public class PrintlettersInAlternateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Selenium testing";
		String text[] = s.split(" ");
		
		  StringBuilder output = new StringBuilder();
		   for (int i = 0; i < s.length(); i++)
		   { 
		   if (i < text[0].length()) 
		   {
		    output.append(text[0].charAt(i)); 
		    }
		   if (i < text[1].length()) 
		   { output.append(text[1].charAt(i));
		    } 
		    }
		  System.out.println(output);
		 

			/*
			 * char c[] = text[0].toCharArray(); char c1[] = text[1].toCharArray(); for (int
			 * k = 0; k < c.length; k++) { System.out.print(c[k]); for (int a = k; a <= k;
			 * a++) { System.out.print(c1[a]); } }
			 */
	}
}