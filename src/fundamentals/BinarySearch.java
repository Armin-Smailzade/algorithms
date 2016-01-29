package fundamentals;

public class BinarySearch {

	//There is a Sorted Array
	public static int binarySearch(int[] a, int key){
		
		int low = 0;
		int high = a.length-1;
		
		while(low<=high){
			
			int middle = low+(high-low)/2;
			if(key < a[middle]) high = middle -1;
			else if(key>a[middle]) low = middle +1;
			else return middle;
		}
		return -1;
	}
}
