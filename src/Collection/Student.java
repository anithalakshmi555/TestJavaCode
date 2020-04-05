package Collection;


public class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;
	
	
	  public int compareTo(Student st2) { if(rollno==st2.rollno) return 0; else
	  if(rollno>st2.rollno) return 1; else return -1; }
	 

	
	public Student(int rollno,String name,int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}

}
