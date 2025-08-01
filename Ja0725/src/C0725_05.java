import java.util.Scanner;

public class C0725_05 {

	public static void main(String[] args) {
		// 반복문
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[ 학생성적프롣그램 ]");
			System.out.println("1. 성적입력"); 
			System.out.println("2. 성적출력"); 
			System.out.println("3. 성적수정"); 
			System.out.println("번호를 입력하세여(0.종료)>> "); 
			int choice = scanner.nextInt();
			if (choice==0) {
				System.out.println("프로그램종료");
				break;
			}
			
		}
		
		
//		int i=0;
//		for(;;i++) { //조건식이 없으면 무한반복
//			System.out.println(i);
//		}
		
		
		
//		int i = 0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
		
		
//		int sum = 0;
//		int i = 0;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		
//		int sum = 0;
//		for (int i=1;i<=10;i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}

	}

}
