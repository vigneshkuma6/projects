package javapractice;

public class VovelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello good morning";
		int vovelcount = 0;
		int constantcount = 0;
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vovelcount++;
			} else {
				constantcount++;
			}
		}
		System.out.println(vovelcount);
		System.out.println(constantcount);

	}

}