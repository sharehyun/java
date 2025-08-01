import java.util.Scanner;

public class C0723_07_입력된숫자만큼출력_홀짝 {

	public static void main(String[] args) {
		// while
		Scanner scan = new Scanner(System.in);
		//입력된 숫자에서 멈추는 프로그램 구현
		System.out.print("숫자를 입력하세요.>> ");
		int input = scan.nextInt();
		System.out.println("1) 홀수   2) 짝수   3) 모두");
		int choice = scan.nextInt();

		
		int i = 1;
		
		while(i<100) {
			System.out.println(i);
			if(input<=i) break;
			if(choice==2) {
				if (i%2==1) {
					i++;
					continue;
				}
			}else if(choice==1) {
				if (i%2==0) {
					i++;
					continue;
				}
			}
			i++;
		}
		
		
		
		
//		//1~100까지 랜덤숫자 출력
//		int rnum = (int)(Math.random()*100)+1;
//		
//		//10번 입력받아 정답/오답-입력숫자가 큽니다 or 작습니다
//		// 정답 : 값
//		Scanner scan = new Scanner(System.in);
//		int i = 1;
//		int input;
//		
//		System.out.println("[ 숫자 맞추기 게임 ]");
//		System.out.println("-----------------");
//		
//		while (i<=10) {
//			
//			System.out.printf("1~100 숫자를 입력하세요.>> ");
//			input = scan.nextInt();
//			if (rnum == input) {
//				System.out.printf("정답!\n입력숫자 : %d\n", input);
//				break;
//			}else if(rnum < input) System.out.printf("입력숫자가 큽니다. 입력숫자 : %d\n", input);
//			else System.out.printf("입력숫자가 작습니다. 입력숫자 : %d\n", input);
//			i++;
//			System.out.println();
//		}
//		System.out.printf("랜덤숫자 : %d\n",rnum);
		
		
		
//		// 구구단 2-9단까지
//		
//		int dan = 2;
//		int mul = 1;
//		
//		while (dan<=9) {
//			System.out.printf(" [ %d 단 ]\n",dan);
//			mul = 1;
//			while (mul<=9) {
//				System.out.printf("%d x %d = %d\n",dan,mul,dan*mul);
//				mul++;
//			}
//			System.out.println();
//			dan++;
//		}

				
		// 500을 넘는 시점의 i,sum 출력
		
//		int sum = 0;
//		int i = 1;
//		while(true) {
//			sum += i;
//			if (sum>=500) break;
//			i++;
//		}
//		System.out.printf("%d까지 더한 합계 : %d\n",i,sum);
		
		
		// 1~100까지 합을 구하시오.
//		int sum = 0;
//		int i = 1;
//		for(i=1;i<=10;i++) {
//			sum += i;
//		}
//		System.out.println("합계 : "+sum);
//		System.out.println("-----------------");
//		
//		sum = 0;
//		i = 1;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("합계 : "+sum);

	}

}
