package j06_클래스;

import java.util.Scanner;

public class userMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		User user1 = new User();
		User user2 = new User();
		
		user1.userId = "asd";
		user1.userPassword = 1111;
		user1.userName = "신경수";
		user1.userEmail = "asdsads";
		user1.userPhon = 4546;
		user1.userAddress = "ㅇㅇㅇㅇ";
		user1.showUserInfo();
		System.out.println();
		
		
		System.out.print("아이디:");
		user2.userId = scanner.nextLine();
		System.out.print("비밀번호:");
		user2.userPassword = scanner.nextInt();
		System.out.print("이름: ");
		user2.userName = scanner.nextLine();
		System.out.print("이메일: ");
		user2.userEmail = scanner.nextLine();
		System.out.print("폰번호: ");
		user2.userPhon = scanner.nextInt();
		System.out.print("주소: ");
		user2.userAddress = scanner.nextLine();
		user2.showUserInfo();
		
		

	}

}
