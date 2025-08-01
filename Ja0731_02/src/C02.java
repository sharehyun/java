
public class C02 {

	public static void main(String[] args) {
//		System.out.printl();  //컴파일에러 - 자바알려줌
		
		int[] arr = {1,2,3}; //3개
		for(int i=0;i<5;i++) { //런타임에러 - 실행할때 에러
			System.out.println(arr[i]);  // 3개->5개
		}
		
		// 예외 - 인터넷 프로그램 이상X, 인터넷 끊김 (에러 : 개발자 잘못 아닌것)
		// ex) 프린트 진행중 프로그램 이상X, 프린트기 off
		// ex) DB연결해서 프로그램 이상X, DB프로그램 문제
		

	}

}
