package javapractice;

public class BinarySearch {
	public static int bs(int a[], int key) {
		int l = 0;
		int h = a.length - 1;
		int mid = 0;
		while (l <= h) {
			mid = l + h / 2;
			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				h = mid - 1;

			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 12, 21, 34, 41, 56, 88, 97 };
		int key = 41;
		System.out.println(bs(arr, key));
		int result = bs(arr, key);
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element is at index " + result);
		}

	}

}
