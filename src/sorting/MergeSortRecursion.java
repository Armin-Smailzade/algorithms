package sorting;

public class MergeSortRecursion {

	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
		
		//assert isSorted(a, lo, mid);       precondition: a[lo...mid] sorted
		//assert isSorted(a, mid+1, hi);	 precondition: a[mid+1...hi] sorted
		
		//copying to the auxilary array
		for(int k = lo; k <= hi; k++)
			aux[k] = a[k];
		
		int i = lo, j = mid+1;
		for(int k=lo; k<=hi; k++){
			
			//if i pointer is exhusted 
			if(i > mid)						a[k] = aux[j++];
			else if(j > hi)					a[k] = aux[i++];
			else if(less(aux[j], aux[i]))	a[k] = aux[j++];
			else							a[k] = aux[i++];
		}
		
		//assert isSorted(a, lo, hi);		postcondition: a[lo...hi] sorted	
		
		}
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
		
		if(hi <= lo)	return;
		int mid = lo + (hi + lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		//if it's partially sorted then stop
		if(!less(a[mid+1], a[mid])) return;
		merge(a, aux, lo, mid, hi);
	}
	
	public static void sort(Comparable[] a){
		
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length -1);
	}
	
	private static boolean less(Comparable v, Comparable w){
		return v.compareTo(w) < 0;
	}
}
