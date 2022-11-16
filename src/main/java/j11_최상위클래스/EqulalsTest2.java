package j11_최상위클래스;

import java.util.Scanner;

public class EqulalsTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String nameInput = scanner.nextLine();
		
		System.out.println(nameInput);
		
		String str1 = "신경수";
		String str2 = "신경수";
		String str3 = new String("신경수");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(nameInput));
		System.out.println(str2.equals(nameInput));
		System.out.println(str1.equals(str3));

	}

}
