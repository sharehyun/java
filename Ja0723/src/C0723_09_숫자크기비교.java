import java.util.Scanner;

public class C0723_09_숫자크기비교 {

	public static void main(String[] args) {
		// 1-100까지 랜덤숫자를 생성해서
		int rnum = (int)(Math.random()*100)+1;
		
		// 5번 입력, 크기비교

		Scanner scan = new Scanner(System.in);
		int[] input = new int[20];
		int i;
		for (i=0;i<20;i++) {
			System.out.printf("숫자를 입력하세요.>> ");
			input[i]=scan.nextInt();
			
			if (rnum==input[i]) {
				System.out.println("정답입니다.");
				break;
			}else if(rnum<input[i]) {
				System.out.println("입력숫자가 더 큽니다.");
			}else {
				System.out.println("입력숫자가 더 작습니다.");
			}
			System.out.println();
			
		}
		
		System.out.println("정답 : "+rnum);
		System.out.print("입력숫자 : ");
		for (int j=0;j<=i;j++) {
			System.out.printf(input[j]+" ");
		}
		
		
		
//		int[] score = {10,20,5,2,3};
//		for (int i=0;i<5;i++) {
//			System.out.println(score[i]);
//		}
//
//		System.out.println(score[2]);
	}

}
