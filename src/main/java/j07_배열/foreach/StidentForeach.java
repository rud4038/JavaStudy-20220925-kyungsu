package j07_배열.foreach;

import j07_배열.classArray.Student;

public class StidentForeach {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		
//		for(Student s : students) {
	//		s = new Student();
		//}

		for(int i = 0; i < students.length; i++) {
			students[i] = new Student(i, "신경수" + (i + 1));
		}
		
		for(Student s : students) {
			System.out.println(s.toString());
		}
		
	}

}
