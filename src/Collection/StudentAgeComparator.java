package Collection;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{ 
	

	public StudentAgeComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
		return 1;
		else return -1;
							
	}

}
