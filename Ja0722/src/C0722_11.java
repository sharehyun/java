import java.util.Scanner;

public class C0722_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
		//랜덤숫자 1-100
//		System.out.println((int)(Math.random()*100)+1);
		// 1~3  맨뒤에 더한 숫자와 중간에 곱하는 숫자에 따라 더한숫자<=x<=곱한숫자
		int rnum = (int)(Math.random()*3)+1; 
		
		//가위-1 바위-2 보-3
		System.out.println("[ 가위바위보 게임 ]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("----------------");
		System.out.println("숫자를 입력하세요.");
		int input = scan.nextInt();
		int verify = input-rnum;
		String my = input==1?"가위":input==2?"바위":"보";
		String com = rnum==1?"가위":rnum==2?"바위":"보";
		
		if (verify == 0) {
			System.out.println("무승부");
		}else if(verify == -2 || verify == 1) {
			System.out.println("승리");
		}else if(verify == -1 || verify == 2 ) {
			System.out.println("패배");
		}else {
			System.out.println("입력 오류");
		}
		
		System.out.println("나 : "+my);
		System.out.println("상대 : "+com);
		
		
		
		
//		if (input == rnum) {
//			System.out.println("정답");
//		}else {
//			System.out.println("오답");
//		}
//		System.out.println("랜덤숫자 : "+rnum);
		
		
		
		// 0.0 <= Math.random() < 1
//		System.out.println((int)(Math.random()*10)+1); // 1 <= x <= 10
//		System.out.println(Math.floor(Math.random()*10));
		
		
		
//		boolean power = false;
//		if(!power) {
//			power = true;
//		}
		
		
		
		
		
//		System.out.println("문자를 입력하세요.");
//		String input = scan.nextLine();  // enter 문자로 인식해 입력으로 받음
////		String input = "";
//		char ch = ' ';
//		
//		if (input != null && !input.equals("")) {
//			ch = input.charAt(0);
//		}
//		
//		System.out.println("출력 : "+ch);

	}

}
