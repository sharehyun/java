import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		//숫자입력받기
		Scanner scan = new Scanner(System.in);
		
		
		//
		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억 이하 덧셈");
		System.out.println("2. 21억 이상 덧셈");
		System.out.println("---------------");
		System.out.println("원하는 번호를 입력하세요.");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			//21억이하 int
			System.out.println("숫자 1을 입력하세요.");
			int inum1 = scan.nextInt();
			System.out.println("숫자 2를 입력하세요.");
			int inum2 = scan.nextInt();
			int isum = inum1+inum2;
			System.out.printf("입력된 숫자 : %d, %d\n",inum1,inum2);
			System.out.println("합계 : "+isum);
			break;
		case 2:
			//21억이하 long
			System.out.println("숫자 1을 입력하세요.");
			long lnum1 = scan.nextLong();
			System.out.println("숫자 2를 입력하세요.");
			long lnum2 = scan.nextLong();
			long lsum = lnum1+(long)lnum2;
			System.out.printf("입력된 숫자 : %d, %d\n",lnum1,lnum2);
			System.out.println("합계 : "+lsum);
			break;
		default:
			break;
		}
		
		
		
		
		
		
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력하세요.");
//		int input2 = scan.nextInt();
//
//		long add = input+(long)input2;
//		System.out.println("입력숫자 : "+input);
//		System.out.println("입력숫자2 : "+input2);
//		
//		System.out.println("합계 : "+add);
//		// string(변수이름).parseInt()

	}

}
