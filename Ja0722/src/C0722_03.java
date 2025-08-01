
public class C0722_03 {

	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = (char)(c1+1);
		System.out.println(c3);
		char c4 = ++c1; // 증감연산자 사용시 자동 타입변경
		System.out.println(c4);
		int i = 'B'-'A';
		System.out.println(i);
		int i2 = 'b'-'a';
		System.out.println(i2);
		int i3 = '1'-'0';  // 0을 빼면 char타입의 숫자가 int타입으로 바뀜. 아스키코드 48을 빼주기 때문
		System.out.println(i3);
		int i4 = '3'-'0';
		System.out.println(i4);
		int i5 = '9'-'0';
		System.out.println(i5);
		
		int n = 5;
		String s = n+"";
		
		int n2 = 123456789;
		String s2 = n2+"";

	}

}
