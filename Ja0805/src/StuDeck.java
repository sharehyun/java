import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	//선언부
	Scanner scan = new Scanner(System.in);
	private int no=0,kor=0,eng=0,math=0,total=0,rank=0,
			choice=0;
	private double avg = 0;
	private String name = "";
	private String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int[] score = new int[3]; //국어,영어,수학
	private Student s;
	
	//파일읽어오기 메소드
	public void stu_FileRead(ArrayList<Student> list) throws Exception {
		FileReader fr = new FileReader("c:/aaa/student.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			list.add(new Student(no,name,kor,eng,math,total,avg));
		}
		br.close();
		fr.close();
		System.out.println("[ c:/aaa/student.txt 파일 읽어오기 성공 ] ");
		System.out.println();
	}//stuFileRead
	
	// 상단메뉴 출력메소드
	int stu_menuPrint() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력"); //완료
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("7. 파일저장");
		System.out.println("0. 프로그램 종료"); //완료
		System.out.println("-------------------");
		System.out.print("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		return choice;
	}
	
	// 학생성적 입력메소드
	void stu_input(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 학생성적 입력 ]");
		System.out.printf("%d번째 학생이름을 입력하세요.(0.이전페이지 이동)>> \n",Student.count+1);
		name = scan.next();
		// 0입력시 -> 이전페이지 이동
		if(name.equals("0")) return; //메소드 실행중지
		for(int i=0;i<3;i++) {
			System.out.printf("%s 점수를 입력하세요.>> ",title[i+2]);
			score[i] = scan.nextInt();
		}
		
		list.add(new Student(name,score[0],score[1],score[2]));
		System.out.printf("%s 학생성적이 저장되었습니다!",name);
		System.out.println();
	}//stu_input
	
	// 학생성적 출력
	void stu_output(ArrayList<Student> list) {
		System.out.println();
		System.out.println("                     [ 학생성적 출력 ] ");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],
				title[5],title[6],title[7]
				);
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			s = list.get(i); 
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank()
					);
		}
		System.out.println();
	}//stu_output
	
	
	//학생성적 파일저장 메소드
	public void stu_fileWrite(ArrayList<Student> list)throws Exception{
		System.out.println();
		System.out.println("[ 파일 저장 ]");

		FileWriter fw = new FileWriter("c:/aaa/student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			String st = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n", 
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
					s.getTotal(),s.getAvg(),s.getRank());
			bw.write(st);
		}
		bw.close();
		fw.close();
		System.out.println("파일이 저장되었습니다.");
		System.out.println();
		
	}

}