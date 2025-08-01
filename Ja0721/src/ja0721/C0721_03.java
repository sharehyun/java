package ja0721;

public class C0721_03 {

	public static void main(String[] args) {
		int a = 10;
		a = 20;
		a = 50;
		System.out.println("a : "+a);
		
		int b = 100;
		b = 200;
		System.out.println("b : "+b);
		
		// 상수
		final int C = 1000;
//		C = 2000; // 상수는 중간에 값을 변경할 수 없다
		System.out.println("C : "+C);
		
		
		int d = a + b;
		System.out.println("d : "+d);
		

	}

}
