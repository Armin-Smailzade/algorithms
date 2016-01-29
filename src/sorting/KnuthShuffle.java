package sorting;
import java.util.Random;

public class KnuthShuffle {

	public static void shuffle(Object[] a){
		int N = a.length;
		for(int i=0; i<N; i++){
			//int r = StdRandom.uniform(i+1);
			//exch(a, i, r);
		}
	}
	
	private static boolean less(Comparable v, Comparable w){
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
