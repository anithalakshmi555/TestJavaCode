package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class ArraylistStudent {

	public ArraylistStudent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ArrayList<Student> s = new ArrayList<Student>();
		Student s1 = new Student(1,"nissi",5);
		Student s2 = new Student(22,"lalli",17);
		Student s3 = new Student(3,"chirag",25);
		Student s4 = new Student(48,"rohan",15);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		Iterator<Student> itr = s.iterator();
		System.out.println("------One of way priniting------");
		while(itr.hasNext())
		{
			Student st =(Student)itr.next();
			System.out.println(st.rollno+"   "+st.name+"   "+st.age);
		}
	
		System.out.println("------Sorting the student obj based on rollno using Comparable ------");
		Collections.sort(s);
		System.out.println("------2nd way  of way priniting------");
		for(Student st1:s) {
			System.out.println(st1.rollno+"   "+st1.name+"   "+st1.age);
		}
		
		
		System.out.println("------Sorting the student class  using Comparator-  based on Name -----");
		Collections.sort(s,new StudentNameComparator());
		for(Student st2:s) {
			System.out.println(st2.rollno+"   "+st2.name+"   "+st2.age);
		}
		
		
		System.out.println("------Sorting the student class  using Comparator-  based on Age -----");
		Collections.sort(s,new StudentAgeComparator());
		for(Student st2:s) {
			System.out.println(st2.rollno+"   "+st2.name+"   "+st2.age);
		}
	
		
	}

}
