package j04_반복;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		/*
		 * 입력: 10
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 * 
		 */
		Scanner in= new Scanner(System.in);
		int i;
		System.out.println("숫자를 입력하세요:");
		int j=in.nextInt();
		
		for(i=0;i<j;i++) {
			System.out.println(i+1);
		}
		for(i=0;i<=j;i++) {
			System.out.println(j-i);
		}
			

	}

}
