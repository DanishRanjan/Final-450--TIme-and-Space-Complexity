import java.util.*;

public class countSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		count(arr, min, max);
		print(arr);
	}

	public static void count(int[] arr, int min, int max) {
		int range = max - min + 1;
		
		//make frequency array
		int farr[] = new int[range];
		for (int i = 0; i < arr.length; i++) {
			int index = arr[i] - min;
			farr[index]++;
		}
		
		//convert it into filling sum array
		for (int i = 1; i < farr.length; i++) {
			farr[i] = farr[i] + farr[i - 1];
		}
		
		//stable sorting (filling ans array)
		int[] ans = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			int val = arr[i];
			int position = farr[val - min];
			int index = position - 1;
			ans[index] = val;
			farr[val - min]--;
		}
		
		//filling original array with the help of ans array.
		for (int i = 0; i < ans.length; i++) {
			arr[i] = ans[i];
		}

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
