import java.util.ArrayList;
import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String name;
		int kor,eng,math,total;
		double avg;
		Stuscore s = null;
		
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("0. 프로그램종료");
		System.out.println("----------------------");
		System.out.print("원하는 숫자를 입력하세요>> ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.printf("%d번 학생이름을 입력하세요.>> ",list.size()+1);
			name = scan.next();
			System.out.printf("%s 학생 국어점수를 입력하세요.>> ",name);
			kor = scan.nextInt();
			System.out.printf("%s 학생 영어점수를 입력하세요.>> ",name);
			eng = scan.nextInt();
			System.out.printf("%s 학생 수학점수를 입력하세요.>> ",name);
			math = scan.nextInt();
			
			list.add(new Stuscore(name,kor,eng,math));
			System.out.printf("%s 학생 정보가 저장되었습니다.\n",name);
			s = (Stuscore)list.get(list.size()-1);
			System.out.printf("저장정보 : %d %s %d %d %d %d %.2f",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg());
			
			break;
		}
		
		

	}

}
