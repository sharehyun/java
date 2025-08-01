import java.util.Scanner;

public class C0722_12 {

	public static void main(String[] args) {
		//02:서울, 031:경기, 032:인천
		Scanner scan = new Scanner(System.in);
		System.out.println("국번을 입력하세요.");
		
		int input = scan.nextInt();
		
		switch(input) {
		case 2:
			System.out.println("서울");
			break;
		case 31:
			System.out.println("경기");
			break;
		case 32:
			System.out.println("인천");
			break;
		default:
			System.out.println("지정되지 않음");
			break;
		}

	}

}
