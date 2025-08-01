import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Stuscore> list = new ArrayList<Stuscore>();
		StuDeck stuDeck = new StuDeck();
		
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
			case 3:
				break;
			
			case 4:
				//who?
				System.out.println();
				System.out.println("[ 학생성적삭제 ]");
				System.out.print("삭제할 학생의 이름을 입력하세요.>> ");
				String name = scan.next();
				
				int temp = 0;
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().contains(name)) {
						temp = 1;
						System.out.printf("%s 이(가) 포함된 학생명을 검색합니다.\n",name);
						System.out.printf("[ %s 학생삭제 ] \n",list.get(i).getName());
						System.out.println("1. 삭제");
						System.out.println("2. 취소");
						choice = scan.nextInt();
						switch(choice) {
						case 1:
							list.remove(i);
							System.out.printf("%s 학생을 삭제했습니다.\n",name);
							break;
							
						case 2:
							System.out.println("삭제가 취소되었습니다.");
							break;
						}//switch
					}//if
				}//for
				
				//찾는 학생이 없는 경우
				if (temp == 0) {
					System.out.println("[ 학생검색실패 ]");
					System.out.println("찾고자 하는 학생이 없습니다. 다시 입력하세요.");
				}
				break;
				
			}
			
			
		}//while

	}//main

}
