
public class Deck {
	Card[] c = new Card[52];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	
	Deck() {
		// 모양, 번호 부여
		for (int i=0;i<c.length;i++) {
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}
	
	//카드섞기 메소드
	void shuffle() {
		Card temp = null;
		int rnum = 0;
		
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
	
	//카드 출력
	//카드 num장 출력 method
	Card[] card_print(int num) {
		if (num>52||num<0) {num = 0;}
		Card[] c_num = new Card[num];
		for(int i=0;i<num;i++){
			c_num[i] = c[i];
		}
		return c_num;
	}
	
	//카드 1장 뽑기
	Card pick(int num) {
		return c[num];
	}
	
	//랜덤카드 1장 뽑기
	Card r_pick() {
		int rnum = (int)(Math.random()*52);
		return c[rnum];
	}
	
}
