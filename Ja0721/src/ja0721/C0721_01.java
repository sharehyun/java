package ja0721;

public class C0721_01 {

	public static void main(String[] args) {
//		print('안녕하세요.'); 홑따옴표X 쌍따옴표O
		System.out.println("안녕하세요.");
		System.out.println("자바시작");
		
		
		// ------------------
		// 변수타입 - 8개
		// char,boolean, (byte,short,*int,long),(float,*double)
		
		// 실수형 - float, double
		// 소수점의 유효성, float - 8자리, double - 15자리 뒤부터 정확도가 보장되지 않음
		// 1.1234567  890   1.123456789012345 6789 6000
		float f = 1.1F; // float타입 - 접미사 F,f
		double d = 1.1; // double타입 - 접미사 생략가능 D,d
		
		
		
		
		// 정수형 - byte,short,int,long
		// int - 21억까지 가능
		// byte - 127까지 숫자표현
		// short - 32000정도까지 슷지표현
		// long - 900경까지 숫자표현, 끝에 접미사 L 붙임
		
		long h = 22000000000L;
		long h2 = 5L;
		long h3 = -2222222222222L;
		
		
		int i = 10;
		int i2 = 2000;
		int i3 = -200000;
//		int i = 2200000000; //에러
		
		
		
		
		
		// true,false만 올 수 있음
		boolean b = true;  //true,false가 소문자로 시작
		boolean b2 = false;
//		boolean b3 = 'a';  // error - true,false만 올 수 있음
		
		
		// 문자를 홑따옴표로만 감싸야 함, 문자는 1글자만
		char c = 'A';
		char c2 = 'B';
		System.out.print(c);
		System.out.print(c2);
		String str = "AB";			// 문자열 변수
		System.out.println(str);
//		char a = "A";  // error - 문자형은 ''로 입력, 1개의 문자만 가능
//		char a = 'AB'; // error - 1개만 가능

	}

}
