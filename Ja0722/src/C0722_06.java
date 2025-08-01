import java.util.Scanner;

public class C0722_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		String input = scan.next();

		
		char ch = input.charAt(0);
		if (ch>='0' && ch<='9') {
			System.out.println("숫자입니다.");
			int num = ch-'0';	//1글자일 경우 문자타입을 int타입으로 변경
								//2글자 이상일 경우 Integer.parseInt(input);
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		
		
		
//		// 첫글자가 영문자인지 아닌지
//		
//		if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
//			System.out.println("영문자입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}
//		
		
		System.out.println("입력 : "+input);

	}

}
