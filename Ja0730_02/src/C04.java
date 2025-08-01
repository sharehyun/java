
public class C04 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.id = "aaa";
		b.pw = "1111";
		b.buyerName = "홍길동";

		// [ 쇼핑몰 사이트 ]
		// 1. TV
		// 2. AUDIO
		// 3. COMPUTER
		// 구매를 원하는 번호를 입력하세요.
		// 1. TV를 구매했어요.
		
		Tv t = new Tv();
		b.buy(t);
		System.out.println("현재잔액 : "+b.money);
		System.out.println("현재보너스 : "+b.bonusPoint);
		
		Audio a = new Audio();
		b.buy(a);
		System.out.println("현재잔액 : "+b.money);
		System.out.println("현재보너스 : "+b.bonusPoint);
		
		b.buy(new Computer());
		System.out.println("현재잔액 : "+b.money);
		System.out.println("현재보너스 : "+b.bonusPoint);
		
	}

}
