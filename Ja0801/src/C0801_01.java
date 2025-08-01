
public class C0801_01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try { // 예외처리 - 프로그램이 다운되지 않고 실행됨
//			System.out.println(0/0);  //숫자를 0으로 나눌 수 없음
			throw new Exception(); // 강제예외 발생
		} catch(Exception e) {
			e.printStackTrace(); //에러 발생 설명, 위치 추적
		} finally {
			System.out.println("반드시 실행됨");
		}
		
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

	}

}
