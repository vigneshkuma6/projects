package javapractice;

import java.util.ArrayList;

public class ReplaceValueInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>test=new ArrayList<String>();
test.add("Test1");
test.add("Test2");
test.add("Test3");
test.add("Test4");
test.add("Test5");
System.out.println("List befor insertion" +test);
int index=test.indexOf("Test2");
test.set(index, "ReplacedTest");
System.out.println("List after insertion"+test);

}

}
