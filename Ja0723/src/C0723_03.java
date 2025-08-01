import java.util.Scanner;

public class C0723_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		double ran = (int)(Math.random()*10); // 0~9
		int rnum = (int)(Math.random()*10)+1; //1~10
		
		System.out.println("[ 랜덤숫자 맞추기 ]");
		System.out.println("1-10까지 숫자를 입력하세요.");
		int input = scan.nextInt();
		
		if (rnum>input) {
			System.out.println("입력숫자가 더 작습니다.");
		}else if (rnum<input) {
			System.out.println("입력숫자가 더 큽니다.");
		}else {
			System.out.println("정답입니다.");
		}
		System.out.println("입력숫자 : "+input);
		System.out.println("랜덤숫자 : "+rnum);
		
	}

}
