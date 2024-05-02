package javapractice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x=" abc.xyz@gmail.com";
		String removed=x.split("@")[0].trim();
		System.out.println(removed);
		String s1=removed.split("\\.")[0];
		System.out.println(s1.toString());
		String s2=removed.split("\\.")[1];
		System.out.println(s2+" "+s1);
	}

}
