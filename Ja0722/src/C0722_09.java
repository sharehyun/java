import java.util.Scanner;

public class C0722_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String result = "";
		
		if (score>=90) {
			result = "A";
			if (score>=97) {
				result += "+";
			}else if (score<=93) {
				result += "-";
			}
		}else if(score>=80) {
			result = "B";
			if (score>=87) {
				result += "+";
			}else if (score<=83) {
				result += "-";
			}
		}else if(score>=70) {
			result = "C";
			if (score>=77) {
				result += "+";
			}else if (score<=73) {
				result += "-";
			}
		}else if(score>=60) {
			result = "D";
			if (score>=67) {
				result += "+";
			}else if (score<=63) {
				result += "-";
			}
		}else {
			result = "F";
		}
		
		System.out.println(result);

		
		
		
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		
//		if (input>0) {
//			System.out.println("양수입니다");
//		}else if (input==0) {
//			System.out.println("0입니다");
//		}else {
//			System.out.println("음수입니다");
//		}

	}

}
