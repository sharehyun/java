import java.util.Scanner;

public class C0724_10_학생성적프로그램 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 변수배열선언
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int count = 0;
		
		
		// 2. 출력구문 - while(true),switch
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------");
			System.out.print("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			System.out.println();
			
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				System.out.println("----------------");
				no[count] = count+1;
				System.out.printf("%d번 학생 이름을 입력해주세요(0.취소)>> ",count+1);
				name[count] = scan.next();
				
				//취소
				if (name[count].equals("0")) {
					System.out.println("이전화면으로 돌아갑니다.");
					System.out.println();
					break;
				}
				
				
				for(int i=0;i<score.length;i++) {
					System.out.printf("%s학생 %s점수를 입력해주세요.>> ",name[count],title[i+2]);
					score[count][i] = scan.nextInt();
					total[count] += score[count][i];
				}
				avg[count] = total[count]/3.0;
				System.out.printf("%d번 학생성적 저장 완료\n",count+1);
				System.out.println();
				count++;
				break;
				
			case 2:
				System.out.println("[ 학생성적출력 ]");
				for (int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("---------------------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%s\t%s\t",no[i],name[i]);
					for(int j=0;j<score[i].length;j++) {
						System.out.printf("%d\t",score[i][j]);
					}//개별점수출력
					System.out.printf("%d\t",total[i]);
					System.out.printf("%.2f\n",avg[i]);
				}//학생별성적출력 for
				
				System.out.println();
				break;
			case 3:
				
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			}//switch
			
			
			
		}
		
		
		
		// 3. 입력
		
		
		// 4. 취소
		// 5. 출력
		// 6. 프로그램종료

		
	}

}
