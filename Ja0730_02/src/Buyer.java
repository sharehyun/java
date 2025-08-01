
public class Buyer {
	String id;
	String pw;
	String buyerName;
	String address;
	String tel;
	
	int money = 10000000; //현재보유금액
	int bonusPoint = 0;  //보너스포인트
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
}
