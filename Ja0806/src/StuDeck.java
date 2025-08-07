import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	//선언부
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","순위"};
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();
	int no=0,kor=0,eng=0,math=0,total=0,rank=0,temp=0;
	String name = "";
	double avg=0;
	
	int choice = 0;

	//파일읽어오기
	public void stu_FileRead(ArrayList<Student> list) throws Exception {
		FileReader fr = new FileReader("c:/aaa/student.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			
			list.add(new Student(no,name,kor,eng,math,total,avg,rank));
		}
		br.close();
		fr.close();
		System.out.println("파일 불러오기 성공");
		System.out.println();
		
	}//FileRead

	
	//메뉴출력
	public int stu_menuprint() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("9. 파일저장");
		System.out.println("-----------------");
		System.out.print("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		return choice;
	}//stu_menuprint


	
	
	
	// 1. 학생성적입력
	public void stu_input(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 학생성적입력 ]");
		System.out.printf("%d번 학생 이름을 입력하세요.>> ",Student.count+1);
		name = scan.next();
		System.out.printf("%s 학생 국어점수를 입력하세요.>> ",name);
		kor = scan.nextInt();
		System.out.printf("%s 학생 영어점수를 입력하세요.>> ",name);
		eng = scan.nextInt();
		System.out.printf("%s 학생 수학점수를 입력하세요.>> ",name);
		math = scan.nextInt();
		list.add(new Student(name,kor,eng,math));
		
		System.out.println("학생성적이 저장되었습니다.");
		System.out.println();
		
	}

	
	
	// 2. 학생성적출력
	public void stu_output(ArrayList<Student> list) {
		System.out.println();
		System.out.println("                        [ 학생성적출력 ]");
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),
					list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),
					list.get(i).getAvg(),list.get(i).getRank()
					);
		}
		System.out.println();
	}//stu_output
	
	
	// 3. 학생성적수정
	public void stu_update(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 학생성적수정 ]");
		System.out.print("수정하려는 학생의 이름을 입력하세요.>> ");
		name = scan.next();
		temp=0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().contains(name)) {
				System.out.println("이름 : "+list.get(i).getName());
				temp = 1;
				no = i;
				break;
			}
			
			if (temp==1) {
				System.out.println("[ 수정과목선택 ]");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.println("0. 수정 취소");
				System.out.println("------------------");
				System.out.print("원하는 번호를 입력하세요.>> ");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("수정 전 국어점수 : "+list.get(no).getKor());
					System.out.print("변경하려는 점수 입력 : ");
					list.get(no).setKor(scan.nextInt());
					System.out.println("국어점수가 변경되었습니다.");
					break;
				case 2:
					System.out.println("수정 전 영어점수 : "+list.get(no).getEng());
					System.out.print("변경하려는 점수 입력 : ");
					list.get(no).setEng(scan.nextInt());
					System.out.println("영어점수가 변경되었습니다.");
					break;
				case 3:
					System.out.println("수정 전 수학점수 : "+list.get(no).getMath());
					System.out.print("변경하려는 점수 입력 : ");
					list.get(no).setMath(scan.nextInt());
					System.out.println("수학점수가 변경되었습니다.");
					break;
				case 0:
					System.out.println("수정 취소");
					break;
					
				}//switch
				
			}//이름찾을시
			else {
				System.out.printf("%s (으)로 검색된 이름이 없습니다. \n",name);
			}//이름못찾았을때
			System.out.println();
		}//for
	}//stu_update
	


	// 5. 등수처리 
	public void stu_rank(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 등수처리 ]");
		for(int i=0;i<list.size();i++) {
			int count = 1;
			for(int j=0;j<list.size();j++)
				if(list.get(i).getTotal()<list.get(j).getTotal()) count++;
			list.get(i).setRank(count);
		}
		System.out.println("등수처리가 완료되었습니다.");
		System.out.println();
	}//stu_rank
	
	
	
	//6. 이름정렬
	public void sort_name(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 이름정렬 ]");
		System.out.println("1. 이름순차정렬");
		System.out.println("2. 이름역순정렬");
		System.out.print("원하는 번호를 입력하세요.>> ");
		choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("[ 이름순차정렬 ]");
			list.sort(new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			System.out.println();
			break;
		case 2:
			System.out.println("[ 이름역순정렬 ]");
			list.sort(new Comparator<Student>() {
				
				@Override
				public int compare(Student o1, Student o2) {
					return o2.getName().compareTo(o1.getName());
				}
			});
			System.out.println();
			break;
		case 3:
			System.out.println("정렬이 취소되었습니다.");
			System.out.println();
			break;
		}
	}//sort_name


	//9. 파일저장
	public void stu_save(ArrayList<Student> list) throws Exception {
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
		
		System.out.println("파일을 저장했습니다.");
	}//stu_save


	
	


}
