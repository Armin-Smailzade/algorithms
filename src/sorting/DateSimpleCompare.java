package sorting;

public class DateSimpleCompare implements Comparable<DateSimpleCompare>{

	private final int month, day, year;
	
	public DateSimpleCompare(int m, int d, int y){
		month = m;
		day = d;
		year = y;
	}
	
	public int compareTo(DateSimpleCompare that){
		
		if(this.year < that.year)	return -1;
		if(this.year > that.year) 	return +1;
		if(this.month < that.month) return -1;
		if(this.month > that.month) return +1;
		if(this.day < that.day) 	return -1;
		if(this.day < that.day) 	return +1;
		return 0;
	}
}
