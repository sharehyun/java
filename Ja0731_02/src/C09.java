import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일생성할 이름을 입력하세요.>> ");
		String fileName = scan.next();
		System.out.println("c:/down/"+fileName+".txt");
		
		File f = new File("c:/down/"+fileName+".txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
				System.out.println("파일을 생성했습니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("이미 있는 파일명입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
