import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C0801_08 {

	public static void main(String[] args) {
		// list -> 순서O 중복O
		// Set -> 순서X 중복X  2개테이블 합칠시 동일한 것은 1개만 입력되도록 할 때
		HashSet set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(4);
		
		//순서가 없어서  for문 사용 불가
		//Iterator 사용
		Iterator it = set.iterator(); // 원래는 list,set 모두 iterator 사용해야 함. 1회용이라 다음번에 다시 객체를 선언해야 함
		while (it.hasNext()) {  //hasNext() - 다음것이 있는지 확인
			System.out.println(it.next());  //next() 1개 가져옴
		}
		System.out.println("--------------------");
		
		Iterator it2 = set.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("--------------------");
		
		
		ArrayList list = new ArrayList();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(1);
		
		Iterator it3 = list.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		
		
		

	}

}
