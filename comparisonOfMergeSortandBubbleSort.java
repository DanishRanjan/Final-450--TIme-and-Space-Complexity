import java.util.*;

public class comparisonOfMergeSortandBubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		long start2 = System.currentTimeMillis();
		mergedSort(arr, 0, arr.length-1);
		long end2 = System.currentTimeMillis();
		System.out.println("Time taken by MergeSort = "+(end2 - start2));
		
		long start1 = System.currentTimeMillis();
		bubble(arr);
		long end1 = System.currentTimeMillis();
		System.out.println("Time taken by BubbleSort = "+(end1 - start1));
	}

	public static int[] mergedArray(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int[] ans = new int[a.length + b.length];
		int k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				ans[k] = a[i];
				i++;
				k++;
			} else {
				ans[k] = b[j];
				j++;
				k++;
			}
		}

		while (i < a.length) {
			ans[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			ans[k] = b[j];
			k++;
			j++;
		}
		return ans;
	}

	public static int[] mergedSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] baseCase = new int[1];
			baseCase[0] = arr[lo];
			return baseCase;
		}
		int mid = (lo + hi) / 2;
		int[] fha = mergedSort(arr, lo, mid);
		int[] sha = mergedSort(arr, mid + 1, hi);
		int[] fsa = mergedArray(fha, sha);

		return fsa;
	}
//------------------------------------------------------//----------------------------------------------------//--------------------------------------------------//---
	public static void bubble(int[] arr) {
		for (int itr = 1; itr <= arr.length - 1; itr++) {
			for (int j = 0; j < arr.length - itr; j++) {
				if (isSmaller(arr, j + 1, j) == true) {
					swap(arr, j + 1, j);
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static boolean isSmaller(int[] arr, int i, int j) {
		if (arr[i] < arr[j]) {
			return true;
		} else {
			return false;
		}
	}
}
