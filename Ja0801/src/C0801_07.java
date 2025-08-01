import java.util.ArrayList;
import java.util.List;

public class C0801_07 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		//숫자 3 삭제됨
//		list.remove(2);
		
		//지울때는 거꾸로 지워야 함
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);  //모두삭제
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
//		Student s = new Student(1,"홍길동",100,100,100);
//		ArrayList<Student> list2 = new ArrayList<Student>();
//		
//		//제너릭 - 특정객체만 입력가능하도록 제어
//		ArrayList<Person> list = new ArrayList<Person>();
//		Person p1 = new Person(10000,"윤소호");
//		list.add(p1);
//		list.add(new Person(10001,"홍길동"));
//		list.add(new Person(10002,"유관순"));
//		list.add(new Person(10003,"이순신"));
//		list.add(new Person(10004,"강감찬"));
//		list.add(new Person(10005,"김구"));
////		list.add(s); // 가능?
//		
//		list.add(new Person(10006,"김유신"));
//		list.add(new Person(10007,"홍길동"));
//		
//		//id출력
//		for (int i=0;i<list.size();i++) {
//			System.out.println((list.get(i)).id+","+(list.get(i)).name);
//		}
//		
//		System.out.println("--------------");
//		
//		//id:10006번을 삭제흐 전체출력
//		for (int i=0;i<list.size();i++) {
//			if(((Person)list.get(i)).id==10006) {
//				list.remove(i);
//				System.out.println("id: 10006 삭제");
//			}
//		}
//		System.out.println("--------------");
//		
//		//전체츨력
//		for (int i=0;i<list.size();i++) {
//			System.out.println(((Person)list.get(i)).id+","+((Person)list.get(i)).name);
//		}
		
		
		
		
		
		//list - 순서O 중복O
//		ArrayList list = new ArrayList();
//		list.add(1);   //add() 추가 - Intager객체
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(3);
//		list.add(5);
//		
//		
//		//크기 - size()
//		for(int i=0;i<list.size();i++) {
//			//읽기 - get()
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("-------");
//		//삭제 - remove()
//		list.remove(3);
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("-------");
//		//clear() - 모두삭제
//		list.clear();
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
		
//		ArrayList list = new ArrayList();
//		List list2 = new ArrayList();
		
	}
}
