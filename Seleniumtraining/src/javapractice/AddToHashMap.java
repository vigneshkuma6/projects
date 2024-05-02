package javapractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class AddToHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Bangalore", 560);
		hm.put("Chennai", 890);
		hm.put("Hyderabad", 566);
		hm.put("Mumbai", 788);
		hm.put("New Delhi", 1000);
		
		
		for(Entry<String, Integer> entry:hm.entrySet())
		{
			System.out.println("Distance from hometown to "+entry.getKey()+"is "+entry.getValue()+"Kms" );
		}
	}

}
