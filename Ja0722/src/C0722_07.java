import java.util.Scanner;

public class C0722_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n1을 입력하세요.");
		int n1 = scan.nextInt();
		
		System.out.println("n2를 입력하세요.");
		int n2 = scan.nextInt();
		
		System.out.println("n3을 입력하세요.");
		int n3 = scan.nextInt();
		
		// 제일 큰수를 출력
		int result = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
		System.out.println(result);
		System.out.printf("n1:%d, n2:%d, n3:%d\n",n1,n2,n3);
		
		
//		String result = n1>n2?"n1이크다":n1==n2?"n1,n2가같다":"n2가크다";
//		System.out.println(result);
		
		
//		// 0보다 크다, 작다
//		String result = n>0?"0보다 크다":n==0?"0이다":"0보다 작다";
//		System.out.println(result);
		
		
//		// 60점이상이면 합격, 미만이면 불합격
//		String result = n>=60?"합격":"불합격";
//		System.out.println("결과 : "+result);
		
		
//		int x = -10;
//		int absX = x>=0?x:-x;
//		System.out.println(absX);
//		
//		String result = x%2 == 0?"짝수":"홀수";
//		System.out.println(result);
//		
//		//짝수인지 아닌지
//		if(x%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}

	}

}
