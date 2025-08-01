package ja0721;

import java.util.Scanner;

public class C0721_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하시오.");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오.");
		int num2 = scan.nextInt();
		
		int result = num1+num2;
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));

	}

}
