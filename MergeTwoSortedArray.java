import java.util.*;
public class MergeTwoSortedArray {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr1 = new int[n];
	for(int i=0;i<arr1.length;i++) {
		arr1[i] = sc.nextInt();
	}
	
	int m = sc.nextInt();
	int[] arr2 = new int[m];
	for(int i=0;i<arr2.length;i++) {
		arr2[i] = sc.nextInt();
	}
	System.out.println(mergedArray(arr1, arr2));
}
public static int[] mergedArray(int[] a, int[] b) {
	int i=0;
	int j =0;
	int[] ans = new int[a.length+b.length];
	int k=0;
	while(i<a.length && j<b.length) {
		if(a[i]<b[j]) {
			ans[k] = a[i];
			i++;
			k++;
		}
		else {
			ans[k] = b[j];
			j++;
			k++;
		}
	}
	
	while(i<a.length) {
		ans[k] = a[i];
		k++;
		i++;
	}
	while(j<b.length) {
		ans[k] = b[j];
		k++;
		j++;
	}
return ans;	
}
}
