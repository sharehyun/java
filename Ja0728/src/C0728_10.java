import java.util.Scanner;

public class C0728_10 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 더하기,빼기,곱하기,나누기를 구성하시오.
		//Cal2.java를 만들어서 구성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3개의 숫자를 입력하세요.>> ");
		int[] num = new int[3];
		for(int i=0;i<3;i++) {
			System.out.printf("%d번째 숫자>> ",i+1);
			num[i] = scan.nextInt();
		}
		System.out.println("[ 사칙연산 프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.printf("원하는 번호를 입력하세요.>> ");
		
		int choice = scan.nextInt();
		
	}

}
