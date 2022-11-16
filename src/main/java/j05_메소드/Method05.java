package j05_메소드;

import java.util.Scanner;

public class Method05 {
	
	public static double getTotal(double kor, double eng, double math) {
		return kor + eng + math; //국어 영어 수학 더해서 반환
	}
	
	public static double getAvg(double total) {
		return total / 3;// 국어 영어 수학 전부 더한값 /3해서 평균 반환
	}
	
	public static void printInfo(int num, 
								double kor, 
								double eng, 
								double math) {
		double totalScore = getTotal(kor, eng, math);// 입력받은 국어 영어 수학 불러와서 getTol  메소드 호출 한 반환값 totalSore 에 변수저장
		
		System.out.println(num+"번 학생 성적");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + getAvg(totalScore));
		System.out.println();                            //학생 번호 국어 영어 수학 총점 평균 출력
	}
	
	public static void inputScore() {              // 학생번호 국어 영어 수학 점수 입력받고 출력 메소드 호출 하는 메소드
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		double kor = 0;
		double eng = 0;
		double math = 0;
		
		System.out.println("학생 번호");//학생번호 입력 받음
		num = scanner.nextInt();
		
		System.out.println("국어:");// 국어점수 입력 받음
		kor = scanner.nextDouble();
		
		System.out.println("영어: ");// 영어 점수 입력받음
		eng = scanner.nextDouble();
		
		System.out.println("수학: ");// 수학 점수 입력받음
		math = scanner.nextDouble();
		
		System.out.println();
		
		printInfo(num, kor, eng, math);
		
		
	}

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {  //반복문 이용하여 입력받는 메소드 3번 호출
			inputScore();
		}
	
	}

}
