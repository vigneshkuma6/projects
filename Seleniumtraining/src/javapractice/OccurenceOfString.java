package javapractice;

public class OccurenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"Array","Array","is","declared"};
		int occ=0;
		int n= str.length;
		String ele="Array";
		// Traverse through map and check frequencies
		for (int i = 0; i < n; i++) {
			if (ele == str[i]) {
				occ++; // Increment the occurrence once the element is found
			}
		}
		// Print the element and its frequency
		System.out.println(ele + " occurred " + occ + " times ");
	}

}
