package j04_반복;

public class ForEx3 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j - i > -1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j + i + 2 > 5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
		for(int i = 0 , n = 0; i < 4; i++ , n--) {
			for(int j=0; j < 8; j++) {
				if(n + 2 < j && i + 4 > j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
