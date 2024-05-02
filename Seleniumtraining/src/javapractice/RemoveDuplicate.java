package javapractice;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aacbbcjoi";
		char[]c=str.toCharArray();
		Set<Character>s=new HashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
			s.add(c[i]);
		}
		System.out.println(s);
	}

}
