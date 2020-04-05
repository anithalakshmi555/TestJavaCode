package Collection;
import java.util.*;

public class StudentNameComparator implements Comparator<Student> {
	
	public StudentNameComparator() {
		// TODO Auto-generated constructor stub
	}
	
	public int compare(Student s1,Student s2) {
		return s1.name.compareTo(s2.name);
		
	}


}
