
public class C02 {

	public static void main(String[] args) {
		
		// 모양, 번호 포함된 카드 52장을 생성
		Deck d = new Deck();
		Card[] card = new Card[52];
		
		// 전체출력
		System.out.println("전체출력");
		card = d.card_print(52);
		for(int i=0;i<card.length;i++) {
			System.out.println("[ "+card[i].getKind()+","+card[i].getN_num()[card[i].getNumber()]+" ]");
		}
		System.out.println();
		
		
		// 카드 섞기
		System.out.println("카드 섞기");
		d.shuffle();
		card = d.card_print(52);
		for(int i=0;i<card.length;i++) {
			System.out.println("[ "+card[i].getKind()+","+card[i].getN_num()[card[i].getNumber()]+" ]");
		}
		System.out.println();
		
		
		// 카드 1장 출력
		System.out.println("카드 1장 출력");
		System.out.println("[ "+card[0].getKind()+","+card[0].getN_num()[card[0].getNumber()]+" ]");
		System.out.println();

		
		// 카드 5장 출력
		System.out.println("카드 5장 출력");
		Card[] c5 = new Card[5];
		for(int i=0;i<c5.length;i++) {
			c5[i] = d.card_print(5)[i];
			System.out.println("[ "+c5[i].getKind()+","+c5[i].getN_num()[c5[i].getNumber()]+" ]");
		}
		System.out.println();
		
		
		// 31번째 카드 출력
		System.out.println("31번째 카드 출력");
		Card c = new Card();
		c = d.pick(31);
		System.out.println("[ "+c.getKind()+","+c.getN_num()[c.getNumber()]+" ]");
		
		System.out.println();
		
		
		// 랜덤카드 한장 출력
		System.out.println("랜덤카드 한장 출력");
		c = d.r_pick();
		System.out.println("[ "+c.getKind()+","+c.getN_num()[c.getNumber()]+" ]");
	}

}
