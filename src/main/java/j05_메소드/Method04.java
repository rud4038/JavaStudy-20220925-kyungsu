package j05_메소드;

import java.util.Scanner;

/**
 * 
 * @author ITPS
 * 
 * 문제 : 
 * 		국어(kor), 영어(eng), 수학(math) 성적을 입력받는다.
 * 		3명
 * 		double kor1
 * 		double kor2
 * 		double kor3
 * 
 * 		double eng1
 * 		double eng2
 * 		double eng3
 * 
 * 		double math1
 * 		double math2
 * 		double math3
 * 
 * 		double total1
 * 		double total2
 * 		double total3
 * 
 * 		double avg1
 * 		double avg2
 * 		double avg3
 * 
 * 		getTotal(kor, eng, math)
 * 
 * 		getAvg(total)
 * 
 * 		printInfo(1, kor, eng, math, total, avg)
 * 
 * 			1번 학생 점수()
 * 			국어: 10.00
 * 			영어: 20.00
 * 			수학: 30.00
 * 
 *	 		총점: 60.00
 * 			평균: 20.00
 *
 */
public class Method04 {
	
	public static double getTotal(double kor, double eng, double math) {
		double total;
		total = kor + eng + math;
		return total;
	}
	
	public static double getAvg(double total) {
		double avg;
		avg = total/3;
		return avg;
	}
	
	public static void printInfo(int i,double kor , double eng , double math, double total, double avg) {
		System.out.println(i+"번째 학생점수()");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println();
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double kor1;
		double kor2;
		double kor3;
		
		double eng1;
		double eng2;
		double eng3;
		
		double math1;
		double math2;
		double math3;
		
		double total1;
		double total2;
		double total3;
		
		double avg1;
		double avg2;
		double avg3;
		
		
		System.out.print("1번째 학생 국어 점수:");
		kor1 = in.nextDouble();
		System.out.print("영어 점수:");
		eng1 = in.nextDouble();
		System.out.print("수학 점수:");
		math1 = in.nextDouble();
		
		System.out.print("2번째 학생 국어 점수:");
		kor2 = in.nextDouble();
		System.out.print("영어 점수:");
		eng2 = in.nextDouble();
		System.out.print("수학 점수:");
		math2 = in.nextDouble();
		
		System.out.print("3번째 학생 국어 점수:");
		kor3 = in.nextDouble();
		System.out.print("영어 점수:");
		eng3 = in.nextDouble();
		System.out.print("수학 점수:");
		math3 = in.nextDouble();
		total1 = getTotal(kor1, eng1, math1);
		total2 = getTotal(kor2, eng2, math2);
		total3 = getTotal(kor3, eng3, math3);
		
		avg1 = getAvg(total1);
		avg2 = getAvg(total2);
		avg3 = getAvg(total3);
		
		printInfo(1, kor1, eng1, math1, total1, avg1);
		printInfo(2, kor2, eng2, math2, total2, avg2);
		printInfo(3, kor3, eng3, math3, total3, avg3);
		
		
		

	}

}
