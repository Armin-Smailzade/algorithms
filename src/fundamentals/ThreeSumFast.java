package fundamentals;

import java.util.Arrays;

public class ThreeSumFast {

	public static int count(int[] a){
		
		int N = a.length;
		Arrays.sort(a);
		int count = 0;
		
		for(int i=0; i<N; i++){
			for(int j=i+1; j<N; j++){
				int k = Arrays.binarySearch(a, -(a[i]+a[j]));
				if(k>j) count++;
			}
		}
		return count;
	}
}
