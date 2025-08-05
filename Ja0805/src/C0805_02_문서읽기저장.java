import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C0805_02_문서읽기저장 {

	public static void main(String[] args) throws Exception {
	
		//글자 저장
		File f = new File("c:/aaa/a0805_01.txt");
		String content = "1,홍길동,100,100,100,300,100.0";
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(content.getBytes());  //write는 byte단위 저장
		
		fos.close();
		System.out.println("글자저장 완료");
		
		
//		// -------파일복사----------
//		File f = new File("c:/img/");
//		if (!f.exists()) {
//			f.mkdirs(); //폴더생송
//		}
//		
//		//파일읽어오기
//		FileInputStream fis = new FileInputStream("c:/aaa/ganadi.png");
//		//파일저장하기
//		FileOutputStream fos = new FileOutputStream("c:/img/ganadi.png");
//		while(true) {
//			int read = fis.read();
//			System.out.println(read);
//			if(read == -1) break;
//			fos.write(read); //파일저장
//		}
//		
//		fis.close();
//		fos.close();
//		System.out.println("프로그램 종료~~");
		
		
//		//--------글자출력-----------
//		// 파일에 있는 글자를 읽어와서 출력
//		byte[] b = new byte[1024];
//		
//		//폴더, 파일 존재 확인
//		File f = new File("C:/aaa/a0805.txt");
//		
//		//try-catch 예외처리 필수
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			int read = 0;
//			
//			//파일안에있는것을 읽어와 문자로 변환
//			while((read = fis.read()) != -1 ) {
//				System.out.print((char)read);  //문자변환
//			}
//			fis.read();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		System.out.println("프로그램 종료~~");

	}

}
