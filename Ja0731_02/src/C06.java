import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06 {

	public static void main(String[] args) {
		// 파일을 읽어와서 문자로 변환해 출력
		// 문자를 읽어와서 출력하는 방식
		
		try {
			FileReader fr = new FileReader("c:/down/a.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				try {
					String line = br.readLine();
					if(line==null) break;
					System.out.println(line);
				} catch (IOException e) {
//					e.printStackTrace();
				}  // 1줄을 읽어옴
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		} finally { //무조건실행
			System.out.println("파일을 닫습니다.");
		}
		System.out.println("프로그램이 잘 종료되었습니다.");

	}

}
