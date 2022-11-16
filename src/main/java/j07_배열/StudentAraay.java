package j07_배열;
/*
 * /codeArray(int), nameArray(String)
 * 총 10명의 학생 정보를 담아야한다.
 * 
 *  임자빈 (20220001)
 *  정윤교 (20220002)
 *  정지음 (20220003)
 *  차하늘 (20220004)
 *  김기덕 (20220005)
 *  장은화 (20220006)
 *  김규민 (20220007)
 *  임지현 (20220008)
 *  노희수 (20220009)
 *  정빈  (20220010)
 */

public class StudentAraay {

	public static void main(String[] args) {
	
		int[] codeArray= new int[10];
		String[] nameArray= new String[10];
		nameArray[0] = "임자빈";
		nameArray[1] = "정윤교";
		nameArray[2] = "정지음";
		nameArray[3] = "차하늘";
		nameArray[4] = "김기덕";
		nameArray[5] = "장은화";
		nameArray[6] = "김규민";
		nameArray[7] = "임지현";
		nameArray[8] = "노희수";
		nameArray[9] = "정빈";
		for(int i=0; i< codeArray.length; i++) {
			codeArray[i] = 20220001+i; 
		}
		System.out.println("[학생정보]");
		for(int i=0; i < codeArray.length; i++) {
			System.out.println("학번: " + codeArray[i]);
			System.out.println("이름: " + nameArray[i]);
			
		}
		

	}

}
