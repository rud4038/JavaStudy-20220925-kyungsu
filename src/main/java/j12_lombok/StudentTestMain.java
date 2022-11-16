package j12_lombok;

import j06_클래스.studentMain;

public class StudentTestMain {

	public static void main(String[] args) {
		Student student = new Student(20220001,"신경수");
		Student student2 = new Student(20220002,"신경수");
		Student student3 = new Student(20220002,"신경수");
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student2.equals(student3));
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		System.out.println(student2.hashCode() == student3.hashCode());

	}

}
