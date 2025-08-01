import java.util.Scanner;

public class C0722_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		
		String input = scan.next();
		String str1 = "c"; // == 비교 안됨, equals() 함수를 사용해야 비교가능
		char ch = 'c';
		
		if (input.equals("c")||input.equals("C")) {
			System.out.println("it is c");
		}else {
			System.out.println("it is not c");
		}
		
		if (input.equalsIgnoreCase("c")) {
			System.out.println("프로그램종료");
		}else {
			System.out.println("프로그램종료불가");
		}

	}

}
