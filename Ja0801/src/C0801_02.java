import java.io.File;

public class C0801_02 {

	public static void main(String[] args) throws Exception {
		
		String folder = "c:/aaa/";
		File fo = new File(folder);
		if(!fo.exists()) {
			fo.mkdirs(); //폴더생성
			System.out.println("폴더가 생성되었습니다.");
		}
		File f = new File("c:/aaa/aabb.txt");
		
		f.createNewFile();  //error - 폴더 aaa가없음, 넘겨진쪽에 try~catch문이 없으면 시스템 다운
		System.out.println("파일이 생성되었습니다.");
		System.out.println("프로그램종료");
		
		
		
		
		
		
		
//		File f = new File("c:/ddd/aabbcc.txt");  //폴더, 파일에 대한 처리 객체
//		try {
//			f.createNewFile(); //파일만 생성 - 폴더는 생성하지 않음
//			// 파일생성 메소드 - try~catch
//			
//		} catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		System.out.println("프로그램이 종료되었습니다.");

	}

}
