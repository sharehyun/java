
public class C0728_06 {

	public static void main(String[] args) {
		// 다른클래스 사용방법 - 객체선언 후 사용
		// 인스턴스 변수 사용방법
		// 객체선언후 사용, 객체개별사용, 참조변수명.변수명
		Card c = new Card();
		c.kind = "spade";
		c.number = 1;
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 2;
		Card c3 = new Card();
		c3.kind = "spade";
		c3.number = 3;
		
		// 52개 객체선언후 값 입력
		Card[] card = new Card[52];
		Card.width = 100;
		Card.height = 250;
		
		
		String[] shape = {"spade","heart","diamond","clover"};
		
		for (int i=0;i<=52;i++) {
			card[i] = new Card(); // 객체선언.
			
			card[i].kind = shape[i/13];
			card[i].number = (i%13)+1;  // 
			System.out.printf("%s %d\n",card[i].kind,card[i].number);
		}
		
		System.out.println("Card0 너비 : "+card[0].width);
		
		
	}

}
