package ja0721;

public class C0721_04 {
	public static void main(String[] args) {
		
		boolean power = true;
		char ch = 'A';
		char ch2 = '\u0061';   // 역슬래시 u : 16진수를 의미함. 16*4+1*1 = 65 == 대문자 A  16*6+1*1 == 97 소문자 a
		char ch3 = 55;
		char tab = '\t';
		char enter = '\n';
		System.out.println("power : "+power);
		System.out.println("ch : "+ch);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		System.out.println("aaa"+ch3+"bbb");
		System.out.println("aaa"+tab+"bbb");
		System.out.println("aaa"+enter+"bbb");
		System.out.println("aaa\t\tbbb");
		
		byte b = 127;
		System.out.println("b : "+b);
		
		int hex = 0x100;   // 0x 붙이면 16진수 : 16^2*1   - 뒤쪽의 100을 16의 0~n제곱으로 풀어 계산
		System.out.println("hex : "+hex);
		
		
		int oct = 0100;  // 앞에 0 붙이면 8진수 : 8^2*1
		System.out.println("oct : "+oct);
		
		long l = 1000000000L;
		float f = 3.14F;
		double d = 3.14;
		double d2 = 3.14D;
		double d3 = 3.14d;
		double d4 = 100;
		System.out.println("d4 : "+d4);


		

		
	}

}
