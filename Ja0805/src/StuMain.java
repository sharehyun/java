import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		//선언부
		Scanner scan = new Scanner(System.in);
		StuDeck stuDeck = new StuDeck();
		ArrayList<Student> list = new ArrayList<Student>();
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		int temp = 0;
		double avg = 0;
		String name = "";
		String[] title = {
				"번호","이름","국어","영어","수학","합계","평균","등수"	
			};
		int[] score = new int[3]; //국어,영어,수학

		//파일읽어오기
		stuDeck.stu_FileRead(list);
		
		loop:while(true) {
			// 상단메뉴출력메소드 호출
			int choice = stuDeck.stu_menuPrint();
			switch(choice) {
			case 1: //학생성적입력
				stuDeck.stu_input(list);
				break;
			case 2: //학생성적출력
				stuDeck.stu_output(list);
				break;
			case 3: //학생성적수정
				stuDeck.stu_update(list);
				break;
			case 4: //학생성적삭제
				stuDeck.stu_delete(list);
				break;
			case 5://등수처리
				stuDeck.stu_rank(list);
				break;
			case 6://이름정렬
				stuDeck.sort_name(list);
				break;
			case 7: //합계정렬
				stuDeck.sort_total(list);
				break;
			case 8: //번호정렬
				stuDeck.sort_no(list);
				break;
			case 9: //파일저장 - true:이어쓰기, false:덮어쓰기
				stuDeck.stu_fileWrite(list);
				break;
				
			
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			}//switch
			
		}
		

	}

}