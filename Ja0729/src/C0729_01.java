import java.util.Arrays;
import java.util.Scanner;

public class C0729_01 {

	public static void main(String[] args) {
		// 다른 클래스 사용시 먼저 객체선언 필요
		Cal cal = new Cal();
		Scanner scan = new Scanner(System.in);
		int a = 10;
		int b = 3;
		
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("5. 전체");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		int result = 0;
		double[] number = new double[4];
		double result2 = 0;
		
		switch(choice){
			case 1:
//				result = cal.add(a, b);
//				System.out.println("결과 : "+result);
				System.out.print("결과 : ");
				cal.add(a, b);
				break;
			
			case 2:
//				result = cal.sub(a, b);
//				System.out.println("결과 : "+result);
				System.out.print("결과 : ");
				cal.sub(a, b);
				break;
			case 3:
//				result = cal.mul(a, b);
//				System.out.println("결과 : "+result);
				System.out.print("결과 : ");
				cal.mul(a, b);
				break;
			case 4:
//				result2 = cal.div(a,b);
//				System.out.println("결과 : "+result2);
				System.out.print("결과 : ");
				cal.div(a, b);
				break;
			case 5:
				//a,b 배열num return
				cal.calProcess(number,a,b);
				System.out.println("더하기 : "+(int)number[0]);
				System.out.println("빼기 : "+(int)number[1]);
				System.out.println("곱하기 : "+(int)number[2]);
				System.out.println("나누기 : "+number[3]);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
		
	}


}
