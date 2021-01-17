import java.util.*;
public class radixSort {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		radix(arr);
		print(arr);
	}

	public static void radix(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int val : arr) {
			if (val > max) {
				max = val;
			}
		}

		int exp = 1;
		while (exp <= max) {
			countSort(arr, exp);
			exp = exp * 10;
		}
	}

	public static void countSort(int[] arr, int exp) {
		int[] ans = new int[arr.length];

		// make frequency array
		int farr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			farr[arr[i] / exp % 10]++;
		}

		// convert it into filling sum array
		for (int i = 1; i < farr.length; i++) {
			farr[i] = farr[i] + farr[i - 1];
		}

		// stable sorting (filling ans array)

		for (int i = arr.length - 1; i >= 0; i--) {
			int position = farr[arr[i] / exp % 10] - 1;
			ans[position] = arr[i];
			farr[arr[i] / exp % 10]--;
		}

		// filling original array with the help of ans array.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ans[i];
		}
		System.out.print("After sorting on " + exp + " place -> ");
		print(arr);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
