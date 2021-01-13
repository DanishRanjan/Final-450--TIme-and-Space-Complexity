import java.util.*;
public class mergeSort {
public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();
    }
    int[] solution = mergedSort(arr, 0, arr.length - 1);
    print(solution);
    
    
	
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
public static int[] mergedSort(int[] arr, int lo, int hi) {
    if(lo==hi){
        int[] baseCase = new int[1];
        baseCase[0] = arr[lo];
        return baseCase;
    }
    int mid = (lo+hi)/2;
    int[] fha = mergedSort(arr,lo,mid);
    int[] sha = mergedSort(arr,mid+1,hi);
    int[] fsa = mergedArray(fha,sha);
    
    return fsa;
}
public static void print(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}