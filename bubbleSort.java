import java.util.*;
public class bubbleSort {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		bubble(arr);
		print(arr);
	}
	public static void bubble(int[] arr) {
		for(int itr=1;itr<=arr.length-1;itr++) {
			for(int j=0;j<arr.length-itr;j++) {
				if(isSmaller(arr, j+1, j)==true){
					swap(arr, j+1,j);
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
