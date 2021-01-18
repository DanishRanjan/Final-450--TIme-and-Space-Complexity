import java.util.*;

public class targetPairSum1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		targetSumPair(arr, target);
	}

	public static void targetSumPair(int[] arr, int target) {
		Arrays.sort(arr);
		
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			if(arr[left]+arr[right]>target) {
				right--;
			}
			else if(arr[left]+arr[right]<target) {
				left++;
			}
			else {
				System.out.println(arr[left]+", "+arr[right]);
				left++;
				right--;
			}
		}

	}
}
