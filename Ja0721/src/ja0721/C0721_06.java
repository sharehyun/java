package ja0721;

public class C0721_06 {

	public static void main(String[] args) {
		// 오버플로우
		byte b = 127;
		System.out.println("b : "+b);
		b = (byte) (b + (byte)10);   // 127+10 = 137
		// byte -128~127 : 137 숫자는 넣을 수 없음
		// 오버플로우
		System.out.println("b : "+b); // -119
		
		int a = 2147483647;
		a = a+3;
		System.out.println("a : "+a);

	}

}