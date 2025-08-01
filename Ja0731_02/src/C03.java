
public class C03 {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println(1);
			System.out.println(2);
			try {
				// 프린트, DB, 인터넷...
				System.out.println(3);
//				System.out.println(3/0);
				System.out.println(4);
				throw new Exception("고의 에러발생"); //에러발생객체
			} catch (Exception e) {
				e.printStackTrace();  //에러설명 출력
				System.out.println(5);
				System.out.println(6);
			}
			System.out.println(7);
				
		}
		
		
//		System.out.println(1);
 //		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(3/0);  //나누기 0은 error
//			System.out.println(4);
//			
//		} catch (Exception e) {
//			System.out.println(5);
//			System.out.println(6);
//		}
//		
//		System.out.println(7);
//
	}

}
