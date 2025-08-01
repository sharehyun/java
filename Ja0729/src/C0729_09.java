import java.util.Scanner;

public class C0729_09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Product[] p = new Product[10];
		int no = 0;
		
		while (true) {
			System.out.println("[ 스마트폰 생산 ]");
			System.out.println("1. 수동생산");
			System.out.println("2. 자동생산");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				p[no] = new Product();
				p[no].serialNo = 1;
				p[no].pName = "스마트폰";
				no++;
				break; 
			case 2:
				
			}
		}
		
		//객체선언
		
		
		
		
		
		
		// 클래스변수 - 클래스명.변수명
//		for(int i=0;i<RanNum.arr.length;i++) {
//			System.out.println(RanNum.arr[i]);
//		}
		
//		int [] n = new int[10];
//		for(int i=0;i<n.length;i++) {
//			n[i] = (int)(Math.random()*10)+1;
//		}
//		for(int i=0;i<n.length;i++) {
//			System.out.println(n[i]);
//		}
		
		
//		System.out.println(arr[0]);
//		C0729_09 c = new C0729_09();
//		System.out.println(c.a);
	}

}
