package javapractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Secondlargeinlst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(3,13,6 ,4, 12, 20, 25,1);
	Collections.sort(list1);
	System.out.println("List after sorting: "+ list1);
	System.out.println(list1.size());
	int SecondLargest= list1.get(list1.size()-2);
	System.out.println("Second largest number is : "+SecondLargest);
	}

}
