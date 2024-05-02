package javapractice;

public class SortAlphabatically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jdkoepacmbtr";
		char temp;
		char c[] = str.toCharArray();
		String s=c.toString();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[j] > c[i]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println(c);
	}

}
