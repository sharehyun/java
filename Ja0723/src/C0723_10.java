import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		// 5명의 이름을 입력받아 출력하시오.
		// 입력이름 : 홍길동 유관순 이순신 강감찬 김구
		// 국어점수 : 100 100 99 80 70
		// 영어점수 : 100 100 99 80 70
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> ",i+1);
			name[i] = scan.next();
			System.out.printf("%s 학생의 국어점수를 입력하세요.>> ",name[i]);
			kor[i] = scan.nextInt();
			System.out.printf("%s 학생의 영어점수를 입력하세요.>> ",name[i]);
			eng[i] = scan.nextInt();
			System.out.printf("%s 학생의 수학점수를 입력하세요.>> ",name[i]);
			math[i] = scan.nextInt();
			System.out.println();
		}
		
		
		System.out.print("입력이름 : ");
		for (int i=0;i<5;i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println();
		
		System.out.print("국어점수 : ");
		for (int i=0;i<5;i++) {
			System.out.print(kor[i]+" ");
		}
		System.out.println();
		
		System.out.print("영어점수 : ");
		for(int i=0;i<5;i++) {
			System.out.print(eng[i]+" ");
		}
		System.out.println();
		
		System.out.print("수학점수 : ");
		for(int i=0;i<5;i++) {
			System.out.print(math[i]+" ");
		}
		System.out.println();
	}

}
