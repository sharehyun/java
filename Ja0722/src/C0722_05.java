import java.util.Scanner;

public class C0722_05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String input = scan.next();		// scan.nextChar는 없음
		char ch = input.charAt(0); 		// abc -> a:0, b:1, c:2  charAt() 괄호 안 차례의 글자를 뜯어옴
		System.out.println("입력문자 : "+input);
		
		
		
		
//		int num = scan.nextInt();
//		if(num>=1&&num<=10) {
//			System.out.println("1~10 사이의 숫자입니다.");
//		}else {
//			System.out.println("1~10 사이의 숫자가 아닙니다.");
//		}
//		
//		if(num<1||num>10) {
//			System.out.println("1~10 사이의 숫자가 아닙니다.");
//		}else {
//			System.out.println("1~10 사이의 숫자입니다.");
//		}
		
		
		
//		double d = 0.1f;
//		System.out.println(d);
//		
//		double d2 = 0.1;
//		System.out.println(d2);
//		
//		if (d == d2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
		
//		if('A'==65) { // A:65, a:97, 0:48
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}	
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("10보다 큰지 작은지 판별");
//		System.out.println("정수를 입력하세요.");
//		int input = scan.nextInt();
//		if (input>10) {
//			System.out.println("10보다 큽니다.");
//		}else if (input<10) {
//			System.out.println("10보다 작습니다.");
//		}else {
//			System.out.println("10입니다.");
//		}
		
		
		
//		int share = 10/8;  //몫
//		double share2 = 10/8.0;  //1.25
//		int remain = 10%8; //나머지
//		System.out.println(share);
//		System.out.println(remain);
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		if (input%2==0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
		
		
	}

}
