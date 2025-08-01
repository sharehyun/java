import java.util.Scanner;

public class C0722_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random()*3)+1; 
		
		//가위-1 바위-2 보-3
		System.out.println("[ 가위바위보 게임 ]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("----------------");
		System.out.println("숫자를 입력하세요.");
		int input = scan.nextInt();
		
		String my;
		String com;
		
		// 내가 낸 것
		switch(input) {
		case 1:
			my="가위";
			break;
		case 2:
			my="바위";
			break;
		case 3:
			my="보";
			break;
		default:
			my="오류";
			break;
		}
		
		// 상대가 낸 것
		switch(rnum) {
		case 1:
			com="가위";
			break;
		case 2:
			com="바위";
			break;
		case 3:
			com="보";
			break;
		default:
			com="오류";
			break;
		}
		
		// 결과 확인
		switch(input-rnum) {
		case -2: case 1:
			System.out.println("승리");
			break;
		case 0:
			System.out.println("무승부");
			break;
		case -1: case 2:
			System.out.println("패배");
			break;
		default:
			System.out.println("오류");
		}
		
		System.out.println("나 : "+my);
		System.out.println("상대 : "+com);

	}

}
