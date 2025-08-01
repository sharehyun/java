import java.util.Scanner;

public class C0723_08 {

	public static void main(String[] args) {
		
		// 5개 숫자 입력받아 배열에 넣어서 출력
		Scanner scan = new Scanner(System.in);

		int[] n = new int[5];
		for(int i=0;i<5;i++) {
			System.out.printf("%d번째 숫자를 입력하세요 >> ",i+1);
			n[i] = scan.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.printf(n[i]+"");
			
		}
		
		
		
		
		
		
//		// 배열 100개짜리, 1-100 넣기
//		int[] a = new int[100];
//		for (int i=0;i<100;i++) {
//			a[i]=i+1;
//			System.out.printf("a[%d] : %d\n",i,a[i]);
//		}
		
		
//		int score0=0,score1=1,score2=2,score3=3,score4=4,score5=5;
//		// 이쪽은 개별로밖에 출력 못함(for문 못돌림)
//		
//		//배열선언 및 값지정1
//		int[] s = new int[6];
//		s[0]=1;
//		s[1]=2;
//		s[2]=3;
//		s[3]=4;
//		s[4]=5;
//		s[5]=6;
//
//
//		//배열선언 및 값지정2
//		for (int i=0;i<6;i++) {
//			s[i] = i+1;
//			System.out.println(s[i]);
//		}
//		
//		//배열선언 및 값지정3
//		int[] m = {1,2,3,4,5,6};
//		
//		//배열선언 및 값지정4
//		int[] n = new int[] {1,2,3,4,5,6};
		

//		int score = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
//		System.out.println(score);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
//		
//		int[] s = new int[100];
//		for(int i=0;i<100;i++) {
//			System.out.println(s[i]);
//		}

		
		// 배열(array)
		// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		// 많은 양의 값을 다룰 때 유용함, 각 요소는 서로 연속적임
		
		// 파이썬의 list의 경우 추가 가능, 배열은 값 추가 불가 - 크기 조정 불가능
		// 해당 사항 보완 위해 '객체배열' 등장
		
		// int[] score 하면 공간 1 -> new int[5] 하면 5개 생기고 score 공간에 주소값 입력
		
		
	}

}
