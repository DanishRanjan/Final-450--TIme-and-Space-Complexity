import java.util.*;
public class selectionSOrt {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	selection(arr);
	print(arr);
}
public static void selection(int[] arr) {
	for(int i=0;i<arr.length-1;i++) {
		int minimumTillYet = i;
		for(int j=i+1;j<arr.length;j++) {
			if(isSmaller(arr, j,minimumTillYet)) {
				minimumTillYet=j;
			}
		}
		swap(arr,i,minimumTillYet);
	}
}
public static void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
public static boolean isSmaller(int[] arr, int i, int j) {
	if(arr[i]<arr[j]) {
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
