import java.util.ArrayList;

public class StuMain {

	public static void main(String[] args) {
		StuDeck stuDeck = new StuDeck();
		ArrayList list = new ArrayList();
//		Stuscore[] s = new Stuscore[10];
		
		while(true) {
			//상단메뉴 출력메소드
			int choice = stuDeck.menu_print();
			
			switch(choice) {
			case 1:
				//학생성적입력 메소드
				stuDeck.stu_input(list);
				break;
			case 2:
				//학생성적출력 메소드
				stuDeck.stu_output(list);
				break;
				
			}
			
			
		}//while

	}//main

}
