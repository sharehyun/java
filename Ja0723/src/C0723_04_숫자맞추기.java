import java.util.Scanner;

public class C0723_04_숫자맞추기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random()*10)+1; //1-10
		int input;
		System.out.println("[ 숫자 맞추기 프로그램 ]");
		System.out.println("-------------------");
		
		for (int i=0;i<5;i++) {
			System.out.println("1~10까지 숫자 중 하나를 입력하세요.");
			System.out.printf("%d번째 도전>> ",(i+1));
			input = scan.nextInt();
			if (input<rnum) {
				System.out.println("랜덤숫자보다 작습니다.");
			}else if (input>rnum) {
				System.out.println("랜덤숫자보다 큽니다.");
			}else {
				System.out.println("정답입니다.");
				System.out.println("랜덤숫자 : "+rnum);
				System.out.println("시도횟수 : "+(i+1));
				break;
			}
		}
		
		
		
		
//		int a = 1;
//		int b = 2;
//		int c,d = 0;
//		int e=0,f=10;
//		int g = 0, double h = 0;  // 다른 타입은 한줄로 표기 안됨

//		for(int i=0;;i++) {
//			System.out.println(i);
//			break;
//		} //break;가 없으면 무한히 실행됨
//		
//		for (;;) {
//			//break;가 없으면 무한히 실행됨
//			break;
//		}
//		
//		while(true) {
//			System.out.println("무한히 반복됨");
//			break;
//		}//break;가 없으면 무한히 실행됨
		
		
//		int sum = 0;
//		for (int i=1;i<=10;i++) {
//			sum = sum+i;
//			sum+=i;
//		}
		
		
//		//1-10 55 1-100 5050 1-1000 500500 1-10000 50005000
//		int sum = 0;
//		int i;
//		for(i=1;i<=10;i++) {
//			System.out.println(i);
//			sum += i;
//		}
//		
//		// 정수-%d 실수-%f 문자열-%s 문자-%c
//		System.out.printf("1 ~ %d 까지 합 : %d\n",(i-1),sum);
//		System.out.println("합계 : "+sum);
		
		
//		// 반복문 - for, while
//		for (int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		System.out.println("-----------");
//		
//		int j=0;
//		while(j<10) {
//			System.out.println(j);
//			j++;
//		}		
//		System.out.println("-----------");
//		
//		int k=0;
//		do {
//			System.out.println(k);
//			k++;
//		}while(k<10);

	}

}
