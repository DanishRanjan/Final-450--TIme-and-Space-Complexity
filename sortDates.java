import java.util.*;

public class sortDates {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			String str = sc.next();
			arr[i] = str;
		}
		sort(arr);
		print(arr);
	}

	public static void sort(String[] arr) {
		countSort(arr, 1000000, 100, 32);
		countSort(arr, 10000, 100, 13);
		countSort(arr, 1, 10000, 2501);
	}

	public static void countSort(String[] arr, int div, int mod, int range) {
		String[] ans = new String[arr.length];

		// make frequency array
		int farr[] = new int[range];
		for (int i = 0; i < arr.length; i++) {
			farr[Integer.parseInt(arr[i],10) / div % mod]++;
		}

		// convert it into filling sum array
		for (int i = 1; i < farr.length; i++) {
			farr[i] = farr[i] + farr[i - 1];
		}

		// stable sorting (filling ans array)

		for (int i = arr.length - 1; i >= 0; i--) {
			int position = farr[Integer.parseInt(arr[i],10) / div % mod] - 1;
			ans[position] = arr[i];
			farr[Integer.parseInt(arr[i],10) / div % mod]--;
		}

		// filling original array with the help of ans array.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ans[i];
		}
	}

	public static void print(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
