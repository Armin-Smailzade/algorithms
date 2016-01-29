package sorting;

import java.util.Comparator;

public class Student_ComparatorModel {

	public static final Comparator<Student_ComparatorModel> BY_NAME = new ByName();
	public static final Comparator<Student_ComparatorModel> BY_SECCTION = new BySection();
	private final String name = null;
	private final int section = 0;
	
	private static class ByName implements Comparator<Student_ComparatorModel>{
		
		public int compare(Student_ComparatorModel v, Student_ComparatorModel w){
			return v.name.compareTo(w.name);
		}
	}
	
	private static class BySection implements Comparator<Student_ComparatorModel>{
		
		public int compare(Student_ComparatorModel v, Student_ComparatorModel w){
			return v.section - w.section;
		}
	}
	
	public void test(){
		
		String a = null;
		//Arrays.sort(a, Student_ComparatorModel.ByName);
//		Arrays.sort(a, Student_ComparatorModel.BySecction);
		
	}
}
