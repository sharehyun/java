package ja0721;

import java.util.Scanner;

public class C0721_08 {

	public static void main(String[] args) {
//		print("")
//		System.out.println("");
//		input()
		Scanner scan = new Scanner(System.in);  // 현재 시스템에서 값을 받겠다?
		System.out.println("숫자를 입력하세요.");
		
		// next(), nextLine() : 문자열, nextLine만 스페이스바, 엔터키까지 받음
		// nextByte(), nextShort(), nextInt(), nextLong() : 정수형
		// nextFloat(), nextDouble() : 실수형
		int num = scan.nextInt();  // 5+enter키
		scan.nextLine();  // 이전에 입력된 enter키를 받을 의미 없는 스캐너
		System.out.println("입력한 숫자 : "+num);
		System.out.println("숫자2 를 입력하세요.");
		String str = scan.nextLine();
		// int타입으로 변경
		int num2 = Integer.parseInt(str); // 문자열을 정수형으로 변경
		System.out.println("숫자 : "+(num+num2)); // 5+100 = 105

		
		
		
		
		
//		String str = "abc";
//		String str2 = new String("abc");
//		int a = 100;

	}

}
