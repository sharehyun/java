import java.util.Scanner;

public class C0729_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor,eng,math, count = 0;
		
		Stuscore[] stu = new Stuscore[5]; // Stuscore 타입 >배열< 5개 선언(공간만 만듦)
		
		loop:while(count<5) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("0. 프로그램종료");
			
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("이름을 입력하세요.>> ");
				name = scan.next();
				System.out.print("국어점수를 입력하세요.>> ");
				kor = scan.nextInt();
				System.out.print("영어점수를 입력하세요.>> ");
				eng = scan.nextInt();
				System.out.print("수학점수를 입력하세요.>> ");
				math = scan.nextInt();
				
				//점수 저장시 total,avg도 같이 저장됨
				stu[count] = new Stuscore(name,kor,eng,math);
				System.out.printf("%s 학생성적이 저장되었습니다. \n",name);
				
				
				count++;
				break;
			case 2:
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("----------------------------------------------");
				for(int i=0;i<=count;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
							stu[i].name,stu[i].kor,stu[i].eng,
							stu[i].math,stu[i].total,stu[i].avg);
				}
				break;
			case 0:
				System.out.println("프로그램조욣");
				break loop;
				
			default:
				System.out.println("잘못입력하쇼ㅕㅆ습니ㅏㄷㄱㄱㄷ");
				break;
			
			}
			
			
			
		}//while
		
	}

}
