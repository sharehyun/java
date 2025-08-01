import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {
		
		//배열선언
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];		
		String[] title = {"국어","영어","수학"};
		
		//값 입력
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> ",i+1);
			name[i] = scan.next();
			
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%s 학생의 %s점수를 입력하세요.>> ",name[i],title[j]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
			avg[i] = total[i]/3.0;
			System.out.println();
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-----------------------------------------------");
		for(int i=0;i<score.length;i++) {
			System.out.printf(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.printf(score[i][j]+"\t");
			}
			System.out.printf("%d\t%.2f\n",total[i],avg[i]);
		}
		
		

	}

}
