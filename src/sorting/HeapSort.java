package sorting;

public class HeapSort{

	private int N;
	
	public static void sort(Comparable[] pq){
		
		int N = pq.length;
		//first pass
		for(int k = N/2; k >= 1; k--)
			sink(pq, k, N);
		
		//second pass
		while(N > 1){
			exch(pq, 1, N--);
			sink(pq, 1, N);
		}
	}
	
	public boolean isEmpty(){
		return N ==0;
	}
	
	public static void sink(Comparable[] pq, int k, int N){
		
		while(2*k <= N){
			int j = 2*k;
			if(j < N && less(pq, j, j+1)) j++;
			if(!less(pq, k, j)) break;
			exch(pq, k, j);
			k = j;
		}
	}
	
	private static boolean less(Comparable[] pq, int i, int j){
		return pq[i].compareTo(pq[j]) < 0;
	}
	
	private static void exch(Comparable[] pq, int i, int j){
		//Key t = pq[i]; pq[i] = pq[j]; pq[j] = t;
	}
}
