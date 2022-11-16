package j03_입력;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name 	= null;
		int age 		= 0;
		String address 	= null;
		String phon 	= null;
		int studentYear = 0;
		String email 	= null;
		
		
		System.out.println("이름: ");
		name = scanner.nextLine();
		System.out.println("나이: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("주소: ");
		address = scanner.nextLine();
		System.out.println("연락처: ");
		phon = scanner.next();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(phon);
	}

}
