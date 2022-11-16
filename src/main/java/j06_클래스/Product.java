package j06_클래스;

public class Product {
	
	String category;
	String productName;
	int price;
	
	Product(){
		System.out.println("상품을 생성합니다.");
	}
	
	Product(String category, String productName, int price){
		this.category = category;
		this.productName = productName;
		this.price = price;
	}
	
	void showProductinfo() {
		System.out.println("카테고리:"+category);
		System.out.println("상품명:"+productName);
		System.out.println("가격:"+price+"원");
		System.out.println();
	}
}
