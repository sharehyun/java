import java.io.File;

public class C04 {

	public static void main(String[] args) {
//		File f = new File("c:/down/a.txt");
		int[] arr = {1,2,3};
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(arr[10]);
//			System.out.println(0/0);
			System.out.println(4);
			System.out.println(4.5);
//			throw new Exception("고의로 에러발생");
		}catch(ArithmeticException e2) {
			// 해당되는 에러가 발생될때 그에 맞는 대응을 하려면 
			System.out.println("0으로 나눴을 때 에러 처리 코드 실행");
		}catch (Exception e) {  // 예외의 최상위 객체, 모든 예외처리 가능
//			e.printStackTrace(); //에러 출력
		}finally {
			System.out.println("마지막실행");
		}

		System.out.println(7);
	}

}
