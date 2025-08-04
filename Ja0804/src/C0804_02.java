import java.util.ArrayList;
import java.util.Comparator;

public class C0804_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(9);
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(7);
		
		
		//정렬 - list[0],[1] 가지고 와서 [0]-[1] = 양수가 나오면 그대로, 음수가 나오면 자리 교체
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1-o2;  //순차정렬
				return o2-o1;  //역순정렬
			}
		});
		
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

	}

}

class DescComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return (Integer)o2-(Integer)o1;
	}
	
}