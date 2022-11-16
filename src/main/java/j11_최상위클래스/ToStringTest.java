package j11_최상위클래스;

public class ToStringTest {

	public static void main(String[] args) {
		
		String str1 = "최상위클래스";
		String str2 = "최상위클래스";
		String str3 = new String("최상위클래스");
	
		System.out.println(str1.toString());
		System.out.println(str2);
		System.out.println(str3);
		
		Student student1 = new Student(2022001, "신경수");
		Student student2 = new Student(2022001, "신경수");

		System.out.println(student1.toString());
		System.out.println(student2);
		
	}

}
