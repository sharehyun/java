import java.util.Scanner;

public class C0724_09_입력출력수정_학생성적프로그램 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//변수 배열선언
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0; // 입력된 학생수
		int choice = 0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		
		
		loop: while (true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------");
			System.out.print("원하는 번호를 입력하세요>> ");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				System.out.println("----------------");
				no[count] = count+1;    // 학생번호 입력
				System.out.printf("%d번 학생이름을 입력하세요.(0.취소)>> ",count+1);
				name[count] = scan.next(); // 이름 입력
				// 취소
				if (name[count].equals("0")) {
					System.out.println("이전화면으로 돌아갑니다.");
					System.out.println();
					break;
				}
				
				
				// 국어,영어,수학입력
				for(int i=0;i<score.length;i++) {
					System.out.printf("%s학생의 %s점수를 입력하세요.>> ",name[count],title[i+2]);
					score[count][i] = scan.nextInt();					
				}
				total[count] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = total[count]/3.0;
				
				System.out.printf("%d번 학생 성적이 저장되었습니다.\n\n",count+1);
				
				count++;
				break;
			case 2:
				System.out.println("[ 학생성적출력 ]");
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("------------------------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0;j<score[i].length;j++) {
						System.out.printf("%d\t",score[i][j]);
					}//개별,합계,평균점수출력
					System.out.printf("%d\t",total[i]);
					System.out.printf("%.2f\n",avg[i]);
				}//숫자출력
				System.out.println();
				
				
				break;
			case 3: //학생성적수정
				System.out.println("[ 학생성적수정 ]");
				System.out.println("----------------");
				System.out.print("수정하고자 하는 학생이름을 입력하세요.>> ");
				String search = scan.next();
				int temp = 0;
				for(int i=0;i<count;i++) {
					if(search.equals(name[i])) {
						System.out.printf("%s 학생을 찾았습니다. \n\n",name[i]);
						
						System.out.println("[ 점수수정 ]");
						System.out.println("-------------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("0. 취소-이전화면 이동");
						System.out.println("-------------------");
						System.out.print("원하는 번호를 입력하세요.>> ");
						choice = scan.nextInt();
						System.out.println();
						
						switch(choice) {
						case 1: case 2: case 3:
							System.out.printf("현재 %s점수 : %d\n",title[choice+1],score[i][choice-1]);
							System.out.printf("변경할 %s점수를 입력하세요.>> ",title[choice+1]);
							score[i][choice-1] = scan.nextInt();
							total[i] = score[i][0]+score[i][1]+score[i][2];
							avg[i] = total[i]/3.0;
							System.out.printf("%s학생 %s점수가 %d점으로 수정되었습니다.\n\n",name[i],title[choice+1],score[i][choice-1]);
							break;

						case 0:
							System.out.print("점수 변경을 취소합니다.\n\n");
							break;
						}
						
						temp = 1; //학생 있을시
						
					}
				}//for
				
				if (temp==0) {
					System.out.printf("찾고자 하는 학생이 없습니다. (검색어: %s)\n\n",search);
				}
				
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
			}// switch
		}// while
		
		
	}//main
}//class