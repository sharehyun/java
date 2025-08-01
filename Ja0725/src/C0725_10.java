import java.util.Scanner;

public class C0725_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] no = new int[5];
		String[] name = new String[5];
		int[][] score = new int[5][3];
		int[] total = new int[5];
		double [] avg = new double[5];
		int choice = 0;
		int count = 0;

		// 성적입력,출력,수정
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		
		//성적수정
		String search = "";
		int temp = 0;
		
		
		
		loop: while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("-----------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("-----------------");
			System.out.print("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				System.out.println("[ 성적입력 ]");
				no[count] = count+1;
				System.out.printf("%d번 학생 이름을 입력해주세요.(0.취소)>> ",count+1);
				name[count] = scan.next();
				
				//취소(이전화면 이동)
				if(name[count].equals("0")) {
					System.out.println("이전화면으로 이동합니다.");
					System.out.println();
					break;
				}
				
				for(int i=0;i<score[i].length;i++) {
					System.out.printf("%s 학생 %s점수를 입력해주세요.>> ",name[count],title[i+2]);
					score[count][i] = scan.nextInt();
					total[count] += score[count][i];
				}
				avg[count] = total[count]/3.0;
				System.out.printf("%s 학생 성적이 입력되었습니다.\n\n",name[count]);
				count++;
				break;
			case 2:
				System.out.println("                      [ 성적출력 ]");
				System.out.println("------------------------------------------------------");
				//타이틀출력
				for (int i=0;i<title.length;i++) {
					System.out.printf(title[i]+"\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------------");
				//성적출력
				for (int i=0;i<count;i++) {
					System.out.printf(no[i]+"\t");
					System.out.printf(name[i]+"\t");
					for (int j=0;j<score[i].length;j++) {
						System.out.printf(score[i][j]+"\t");
					}
					System.out.printf(total[i]+"\t");
					System.out.printf("%.2f\n",avg[i]);
				}
				System.out.println();
				
				break;
			case 3:
				System.out.println("[ 성적수정 ]");
				System.out.print("수정하고자 하는 학생의 이름을 입력해주세요.>> ");
				search = scan.next();
				for (int i=0;i<count;i++) {
					if(name[i].contains(search)) {
						
						
						
						
						System.out.printf("%s 학생의 성적을 수정합니다.\n\n",name[i]);
						System.out.println("[ 수정 과목 선택 ]");
						System.out.println("---------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("---------------");
						System.out.print("원하는 번호를 입력하세요.>> ");
						choice = scan.nextInt();
						
						System.out.println();
						
						
						switch(choice) {
						case 1: case 2: case 3:
							System.out.printf("현재 %s점수 : %d\n",title[choice+2],score[i][choice-1]);
							temp = score[i][choice-1];
							System.out.print("수정 점수를 입력하세요.>> ");
							score[i][choice] = scan.nextInt();
							total[i] = score[i][0]+score[i][1]+score[i][2];
							avg[i] = total[i]/3.0;
							
							System.out.printf("%s학생 %s성적이 수정되었습니다.\n\n",name[i],title[choice+2]);
							break;
						default:
							System.out.println("입력 오류");
						}
						
					}
					
				}
				
				
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			default:
				System.out.println("없는 선택지입니다. 다시 입력하세요.");
			}			
		}
		

	}

}
