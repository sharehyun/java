import java.util.Scanner;

public class C0729_10 {
	
	public static void main(String[] args) {
		// 학생성적입력
		// no - 객체선언시 자동증가
		
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		int n = 0;
		
		
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		
		System.out.print("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			while(n<10) {
				System.out.printf("%d번째 이름을 입력하세요.>> ",n+1);
				String name =scan.next();
				System.out.printf("%s학생 국어점수를 입력하세요.>> ",name);
				int kor=scan.nextInt();
				System.out.printf("%s학생 영어점수를 입력하세요.>> ",name);
				int eng=scan.nextInt();
				System.out.printf("%s학생 수학점수를 입력하세요.>> ",name);
				int math=scan.nextInt();
				
				
				s[n] = new Stuscore(name,kor,eng,math);
				System.out.println();
				System.out.printf("입력정보 : %d,%s,%d,%d,%d,%d,%.2f\n\n\n",
						s[n].no,s[n].name,s[n].kor,s[n].eng,
						s[n].math,s[n].total,s[n].avg);
				n++;				
			}
			break;
		}
		
	}

}
