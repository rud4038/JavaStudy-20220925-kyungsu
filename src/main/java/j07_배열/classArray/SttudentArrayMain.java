package j07_배열.classArray;

public class SttudentArrayMain {

	public static void main(String[] args) {
		Student[] students = new Student[10];

		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			
		}
		System.out.println("-----------------------");
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student(2022001 + i, "신경수" + (i + 1));
		}
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
	}

}
