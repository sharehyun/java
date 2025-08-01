
public class C0728_02 {

	public static void main(String[] args) {
		// Tv 클래스 객체생성
		// 색상 = pink, 채널 = 7
		
		Tv t = new Tv();
		t.color = "pink";
		t.channel = 7;
		System.out.println(t.color);
		System.out.println(t.channel);
		
		// t2 생성해서 white,5
		Tv t2 = new Tv();
		t2.color = "white";
		t2.channel = 5;
		
		System.out.println(t2.color);
		System.out.println(t2.channel);

	}

}
