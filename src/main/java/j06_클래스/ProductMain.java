package j06_클래스;

public class ProductMain {

	public static void main(String[] args) {
		Product Product1 = new Product();
		Product Product2 = new Product();
		
		Product1.category = "텀블러";
		Product1.productName = "블루 텀블러";
		Product1.price = 15000;
		Product1.showProductinfo();
		
		Product2.category = "머그컵";
		Product2.productName = "화이트 머그컵";
		Product2.price = 20000;
		Product2.showProductinfo();
		
		Product Product3 = new Product("커피","아이스 아메리카노",4500);
		Product3.showProductinfo();

	}

}
