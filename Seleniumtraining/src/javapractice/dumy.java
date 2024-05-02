package javapractice;

import java.util.HashSet;
import java.util.Set;

public class dumy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		boolean t=true;
		boolean f=false,b;
		b=(t|((i++)==0));
		b=(f|((i+=2)>0));
System.out.println(i);

Set<String>set=new HashSet<String>();
set.add("1");
for(String s:set)
{
	System.out.println(s);
}
	}
}

