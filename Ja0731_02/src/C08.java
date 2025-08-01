import java.io.File;
import java.io.IOException;

public class C08 {

	public static void main(String[] args) {
		File f = new File("c:/down/abc.txt");  //없는 파일
		if(!f.exists()) {
			try {
				f.createNewFile();   //용량이 꽉 차거나 하드 에러났을 때 예외 발생 가능성 있음
			} catch (IOException e) {
				e.printStackTrace();
			}  //파일을 생성함
			System.out.println("파일이 생성되었습니다.");
		}else {
			System.out.println("파일이 존재합니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
