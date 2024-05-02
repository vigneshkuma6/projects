package javapractice;

public class CountCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "RahulShettyAcademY";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
