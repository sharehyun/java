import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuMain {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		StuDeck StuDeck = new StuDeck();
		ArrayList<Student> list = new ArrayList<Student>();
		int no=0,kor=0,eng=0,math=0,total=0,rank=0,choice=0,temp=0;
		String name = "";
		double avg=0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","순위"};
		
		StuDeck.stu_FileRead(list);
		
		

		
		loop:while(true) {
			choice = StuDeck.stu_menuprint();
			
			switch(choice) {
			case 1://성적입력
				StuDeck.stu_input(list);
				break;
			case 2://성적출력
				StuDeck.stu_output(list);
				break;
			case 3://성적수정
				StuDeck.stu_update(list);
				break;
			case 5://등수처리
				StuDeck.stu_rank(list);
				break;
			case 6://이름정렬
				StuDeck.sort_name(list);
				break;
			case 9://파일저장
				StuDeck.stu_save(list);
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
				
			}//switch
		}
	}

}
