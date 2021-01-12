import java.util.*;
public class InsertionSort {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	Insertion(arr);
	print(arr);
}
public static void Insertion(int[] arr) {
	for(int i=1;i<arr.length;i++) {
		for(int j=i-1;j>=0;j--) {
			if(isGreater(arr, j, j+1)){
				swap(arr, j, j+1);
			}
			else {
				break;
			}
		}
	}
}
public static void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
public static boolean isGreater(int[] arr, int j, int i) {
	if(arr[j]>arr[i]) {
		return true;
	}
	else {
		return false;
	}
}
public static void print(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
