import java.util.*;
public class quickSort {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	quick(arr, 0, arr.length-1);
	print(arr);
	
}
public static void quick(int[] arr, int low, int high) {
	if (low > high) {
        return;
    }
    int pivot = arr[high];
    int pidx = partition(arr, pivot, low, high);
    quick(arr, low, pidx - 1);
    quick(arr, pidx + 1, high);
}
public static int partition(int[] arr, int pivot, int low, int high) {
	int i=low;
	int j=low;
	while(i<=high) {
		if(arr[i]>pivot) {
			i++;
		}
		else {
			swap(arr, i, j);
			i++;
			j++;
		}
	}
	return (j-1);
}
public static void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
}