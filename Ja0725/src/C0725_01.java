
public class C0725_01 {

	public static void main(String[] args) {
		// 자바 기본 8개 타입
		//boolean,char,byte,short,int,long,float,double
		//String
		
		boolean a = true;
		boolean a_2 = false;
		
//		char b = '';    //error
		char b_2 = ' '; //가능
		char b_3 = 'a'; //1글자 가능
//		char b_4 = 'ab'; //2글자 이상은 안됨
		char b_5 = 97; //97:a 65:A 48:0
		char b_6 = 42; //*
		
		char b_7 = 52;
		int b_8 = b_7-48; // '4'-'0'=4
		
		byte c = (byte)(127+1); //128 -> -128 오버플로우발생
		//byte,short,char -> 사칙연산 -> int타입으로 변경되어 계산
		
		int d = 2147483647;   //21억까지 숫자계산가능
		int d_2 = (int)(2147483648L);  //오버플로우 발생
		int d_3 = 1000000;
		
		int d_4 = 1000000 * 1000000 / 1000000; // -727
		int d_5 = 1000000 / 1000000 * 1000000; // 1000000

		long e = 1L;   // 900경까지 숫자 계산 가능
		long e_2 = 2l;
		
		float f = 1.0f;  // 접미사 f,F를 무조건 붙여야 함
		float f_2 = 1.1234567123f;  //소수점 8자리까지 유효성인정
		
		double g = 1.0d;  //접미사 d,D 생략가능
		double g_2 = 1.0;
		double g_3 = 1.1234567890123456789;  // 소수점 16자리까지 유효성 인정
		
		float g_4 = 0.1f;
		double g_5 = 0.1;

		double g_6 = (double)g_4;
		float g_7 = (float)g_5;
		
		//float -> double 타입변경하지 않음
		//double -> float 타입변경해서 비교
		
		String s = "";    //가능
		String s_2 = " "; //가능
		String s_3 = new String("abc"); //정석
		String s_4 = "abc"; //가능
		
		int s_5 = 10;
		String s_6 = ""+s_5;  //문자열타입으로 변경하는 방법
		String s_7 = "5";
		String s_8 = "100";
		// 문자열 + 문자열 = 뒤에 문자열이 붙이는 방법 계산됨
		// -,*,/ 안됨
//		System.out.println(s_7+s_8);  //"5"+"100"="5100"
		int s_9 = Integer.parseInt(s_7);  //문자열 -> int타입변경
		double s_10 = Double.parseDouble(s_8);  //문자열 -> double타입변경
		
		// 문자열에서 1개 문자를 분리
		String s_11 = "홍길동";
		char s_12 = s_11.charAt(0);
		
		// 문자열 비교 - equals()
		String s_13 = "10";
		String s_14 = new String("10");
		
//		if(s_13==s_14) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		//equals
//		if(s_13.equals(s_14)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
		
		// 문자열 + 7가지연산 => 문자열로 변경됨
//		System.out.println(""+1);	//문자열
//		System.out.println(""+'a'); //문자열
//		System.out.println(""+1.12345); //문자열
		
		
		
		
//		if(a_2) {
//			System.out.println("true입니다.");
//		}else {
//			System.out.println("false입니다.");
//		}

	}

}
