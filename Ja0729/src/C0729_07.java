
public class C0729_07 {
	
	static int b; 	// 클래스변수 - 객체선언x,공용,클래스명.변수명
	int c; 			// 인스턴스변수 - 객체선언o,개별,참조변수명.변수명

	public static void main(String[] args) {
		int a = 0; // 지역변수 - 초기화 안됨
		System.out.println("지역변수 : "+a);  //초기화해야 사용가능
		
		// 클래스변수,인스턴스변수 - 자동초기화됨
		System.out.println("클래스변수 : "+C0729_07.b); //초기화없이 사용가능
		C0729_07 cc = new C0729_07();
		
		System.out.println("인스턴스변수 : "+cc.c);  // 객체선언후 사용가능

	}

}
