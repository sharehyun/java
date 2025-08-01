
public class C0728_07 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "HEART";
		c1.number = 7;
		Card.width = 100;
		Card.height = 250;
		Card c2 = new Card();
		c2.kind = "SPADE";
		c2.number = 4;
		Card.width = 50;
		Card.height = 80;
		
		
		System.out.printf("%s %d %d %d\n", c1.kind,c1.number,Card.width,Card.height);
		System.out.printf("%s %d %d %d", c2.kind,c2.number,Card.width,Card.height);
		
	}

}
