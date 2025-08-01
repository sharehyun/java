import java.util.Scanner;

public class C0725_03 {

	public static void main(String[] args) {
		//스캐너 - 콘솔창에서 입력받을때
		Scanner scanner = new Scanner(System.in);		
		
		
		
		
		//문자열 - nextLine() - enter까지 입력받음, next() enter 입력 안받음
		System.out.println("이름을 입력하세요.");
		String a = scanner.next();
		scanner.nextLine();
		System.out.println("아이디르 입력하세요ㅕ");
		String b = scanner.nextLine();
		System.out.println("이름 : "+a);
		System.out.println("아이디 : "+b);
		
		
		
		
		//println,print,printf
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		System.out.println("a : "+a+"\tb : "+b+"\tc : "+c);
//		// %d 정수 %f 실수 %s 문자열 %c 문자
//		System.out.printf("a : %d\tb : %d\tc : %d\n",a,b,c);
//		
//		
//		System.out.println("a");
//		System.out.println("b");
//		System.out.println("c");
//		System.out.print("d\n"); // \n enter
//		System.out.print("e\t"); // \t tab
//		System.out.print("f");

	}

}
