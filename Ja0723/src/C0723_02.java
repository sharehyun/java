import java.util.Scanner;

public class C0723_02 {

	public static void main(String[] args) {
		// 월을 입력받아 봄여름가을겨울
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int mon = scan.nextInt();
		String season, season2;
		
		if (mon==1||mon==2||mon==12) {
			season = "겨울";
		}else if(mon==3||mon==4||mon==5) {
			season = "봄";
		}else if(mon==6||mon==7||mon==8) {
			season = "여름";
		}else if(mon==9||mon==10||mon==11) {
			season = "가을";
		}else {
			season = "알수없음";
		}
		
		System.out.println("if 판별 : "+season);
		
		
		switch (mon) {
		case 3: case 4: case 5:
			season2 = "봄";
			break;
		case 6: case 7: case 8:
			season2 = "여름";
			break;
		case 9: case 10: case 11:
			season2 = "가을";
			break;
		case 12: case 1: case 2:
			season2 = "겨울";
			break;
		default:
			season2 = "알수없음";
			break;
		}
		
		System.out.println("switch 판별 : "+season2);
		
		
		
		
		
//		// 성적 입력받아 90점이상-A,80-B,70-C,60-D,F
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성적을 입력하세요.");
//		int score = scan.nextInt();
//		char result;
//		
//		// if, else if, else
//		
//		if (score>=90) {
//			result = 'A';
//		}else if(score>=80) {
//			result = 'B';
//		}else if(score>=70) {
//			result = 'C';
//		}else if(score>=60) {
//			result = 'D';
//		}else {
//			result = 'F';
//		}
//		
//		System.out.println("결과 : "+result);
		
	}

}
