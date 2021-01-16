import java.util.*;
public class quickSelect {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int k = sc.nextInt();
	System.out.println(quick(arr, 0, arr.length-1, k-1));
}
public static int quick(int[] arr, int low, int high, int k) {
	
    int pivot = arr[high];
    int pivotIndex = partition(arr, pivot, low, high);
    if(k>pivotIndex) {
    	return quick(arr, pivotIndex + 1, high,k);	
    }
    else if(k<pivotIndex) {
    	return quick(arr, low, pivotIndex - 1,k);	
    }
    else {
    	return arr[pivotIndex];
    }
    
    
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
