import java.util.Scanner;

public class C0723_05_합계초과시점 {

	public static void main(String[] args) {
		// 1-100까지의 합
		
		
		
		// 합계가 500을 넘는 시점 전단계를 출력
		int sum = 0;
		int i;
		for (i=1;i<=100;i++) {
			sum += i;
			if (sum>=500) {
				sum-=i;
				i-=1;
				break;
				}
		}
				
		System.out.printf("%d번째 합 : %d",i,sum);
		
		// 합계가 100을 넘는 시점을 출력
//		int sum = 0;
//		int i;
//		for (i=1;i<=100;i++) {
//			sum += i;
//			if (sum>=100) {
//				break;
//			}
//		}
		
//		System.out.printf("%d번째 합 : %d",i,sum);
		
//		// 1-10까지 숫자의 합을 출력하시오.
//		// 두 수를 입력받아 n1~n2까지의 합을 구하시오
//		int sum = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[ 합 출력 프로그램 ]");
//		System.out.println("-----------------");
//		System.out.println("1~10 사이의 숫자를 입력하세요.");
//		
//		System.out.printf("첫번째 숫자>> ");
//		int n1 = scan.nextInt();		
//		System.out.printf("두번째 숫자>> ");
//		int n2 = scan.nextInt();
//		
//		if (n1>n2) {
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//		
//		for(int i=n1;i<=n2;i++) {sum += i;}
//		
//		System.out.println("-----------------");
//		System.out.println("합계 : "+sum);

	}

}
