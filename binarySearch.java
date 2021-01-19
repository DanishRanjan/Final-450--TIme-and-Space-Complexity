import java.util.*;
public class binarySearch {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	int target = sc.nextInt();
	System.out.println(BSearch(arr,target));
}
public static int BSearch(int[] arr, int target) {
	Arrays.sort(arr);
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid = (start+end)/2;
		if(target>arr[mid]) {
			start=mid+1;
		}
		else if(target<arr[mid]) {
			end=mid-1;
		}else {
			return mid;
		}
	}
	return -1;
		
	
	
}
}
