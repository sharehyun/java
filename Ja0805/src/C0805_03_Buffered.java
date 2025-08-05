import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class C0805_03_Buffered {

	public static void main(String[] args) throws Exception {
//		//------- BufferWriter,FileWriter 사용
		FileWriter fw = new FileWriter("c:/aaa/a0805_02.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String[] str = {
				"1,홍길동,100,100,100,300,100.0\n",
				"2,유관순,90,90,90,270,90.0\n",
				"3,이순신,80,80,80,240,80.0\n",
				"4,강감찬,70,70,70,210,70.0\n"
		};
		
		for(int i=0;i<str.length;i++) {
			bw.write(str[i]);
		}
		
		bw.close();
		fw.close();
		System.out.println("글자 저장완료!");
		
		
		
//		//------- BufferedReader, FileReader 사용
//		String fileName = "C:/aaa/a0805.txt";
//		FileReader fr = new FileReader(fileName);
//		BufferedReader br = new BufferedReader(fr);  // 1줄단위로 읽어옴
//		
//		while(true) {
//			String line = br.readLine();  //1줄단위로 가져오기
//			if(line==null) break;
//			System.out.println(line);
//		}
//		
//		
//		br.close();
//		fr.close();
//		
//		System.out.println("프로그램 종료!");
		
		
		
//		//----- FileReader 사용
//		try {
//			FileInputStream fis = new FileInputStream(fileName);
//			FileReader fr = new FileReader(fileName);
//			
//			int data = 0;
//			while( (data=fr.read()) != -1 ) {   //FileReader 사용
//				System.out.print((char)data);
//			}
//			fis.close();
//					
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("프로그램 종료~");
	}

}
