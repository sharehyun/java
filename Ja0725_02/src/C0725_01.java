
public class C0725_01 {

	public static void main(String[] args) {
		int a=10;
		String str2 = "abc";
		//참조형변수, 참조변수
		String str = new String("abc");
		
		//Tv class 사용법
		// 객체선언 - 인스턴스선언
		Tv t = new Tv();
		t.color = "white";
		t.channel = 7;
		t.channelUp();
		System.out.println("현재채널 : "+t.channel);
		
		Tv t2 = new Tv();
		t2.color = "pink";
		t2.channel = 5;
		System.out.println("현재채널 : "+t2.channel);
		
		Stuscore s = new Stuscore();

	}

}
