import java.util.Scanner;

public class C0728_05 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		
		StuScore[] s = new StuScore[3]; //배열선언
		for(int i=0;i<s.length;i++) {
			s[i] = new StuScore();  //객체선언
			System.out.printf("이름을 입력하세요.>> ");
			s[i].name = scan.next();
			System.out.printf("국어점수를 입력하세요.>> ");
			s[i].kor = scan.nextInt();
			System.out.printf("영어점수를 입력하세요.>> ");
			s[i].eng = scan.nextInt();
			System.out.printf("수학점수를 입력하세요.>> ");
			s[i].math = scan.nextInt();
			s[i].stuTotal();
			s[i].stuAvg();
		}
		
		
		System.out.println();
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		for(int i=0;i<=2;i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		}
	}

}
