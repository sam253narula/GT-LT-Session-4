package f_com.rnd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortStudentsFirstByNameThenByAge {

	@SuppressWarnings({ "unchecked", "unused" })
	private static void sort(List<Student> Students) {

	    Collections.sort(Students, new Comparator() {

	        public int compare(Object o1, Object o2) {

	            String x1 = ((Student) o1).getName();
	            String x2 = ((Student) o2).getName();
	            int sComp = x1.compareTo(x2);

	            if (sComp != 0) {
	               return sComp;
	            } 

	            Integer y1 = ((Student) o1).getAge();
	            Integer y2 = ((Student) o2).getAge();
	            return y1.compareTo(y2);
	    }});
	}
	
	public static void main(String[] args) {
		// Creating a list of students
				ArrayList<Student> al = new ArrayList<Student>();
				al.add(new Student(101, "Vijay", 23));
				al.add(new Student(102, "Ajay", 28));
				al.add(new Student(103, "Ajay", 27));
				al.add(new Student(104, "Jai", 21));
				sort(al);
				System.out.println(al);
		
		
	}

}
