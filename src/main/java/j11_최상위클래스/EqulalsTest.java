package j11_최상위클래스;

import java.util.Scanner;

public class EqulalsTest {

	public static void main(String[] args) {
		Student student1 = new Student(2022001, "신경수");
		Student student2 = new Student(2022001, "신경수");
		
		System.out.println(student1.equals(student2));
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1.hashCode() == student2.hashCode());
		
	}

}
