package stringprogram;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello good morning";
		String empty="";
		for(int i=0;i<s.length();i++)
		{
			if(!empty.contains(String.valueOf(s.charAt(i))))
			{
				empty=empty+s.charAt(i);
			}
		}
		System.out.println(empty);

	}

}
