import java.util.Scanner;

public class C0724_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		String[] title = {"국어","영어","수학"};
		int[] total = new int[3]; 
		double[] avg = new double[3]; 
		
		// 입력
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> ",i+1);
			name[i] = scan.next();
			for (int j=0; j<score[i].length;j++) {
				System.out.printf("%d번째 %s점수를 입력하세요.>> ",i+1,title[i]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
			avg[i] = total[i]/3.0;
			System.out.println();
		}
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("------------------------------");
		for(int i=0;i<score.length;i++) {
			System.out.printf("%s\t",name[i]);
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\t%.2f\n",total[i],avg[i]);
		}
		
		
		
		// 출력
		// 이름 국어 영어 수학
		// 홍길동 100 100 99
		// 유관순 90 90 91
		
		
		// 5,5배열
		// 1 2 3 4 5
		// 6 7 8 9 10
		// ...
		// 21 22 23 24 25
		
//		int[][] arr = new int[5][5];
//		for (int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = 5*i+j+1;
//			}
//		}
//		
//		for (int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.printf(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
			
		
		
//		int [][] score = new int[5][3];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = 3*i+j; //0,1,2,3,4,5,6,7,8,9
//			}
//			
//		}
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.println(score[i][j]);
//			}
//		}
//		
//		int[] num = new int[5];
//		for(int i=0;i<num.length;i++) {
//			num[i] = i; //0,1,2,3,4
//		}

	}

}
