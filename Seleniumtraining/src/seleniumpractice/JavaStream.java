package seleniumpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>names= new ArrayList<String>();
		names.add("Abhijeet");
		names.add("dom");
		names.add("Akash");
		names.add("Adam");
		names.add("ram");
		
Long c = names.stream().filter(s->s.startsWith("A")).count();
System.out.println(c);
Stream.of("Abhijeet","dom","adam","ram").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
