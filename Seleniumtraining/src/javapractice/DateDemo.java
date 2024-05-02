package javapractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d= new Date();
		System.out.println(d.toString());
		SimpleDateFormat sft = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(	sft.format(d));
	}

}
