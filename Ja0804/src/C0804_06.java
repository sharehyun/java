import java.util.ArrayList;

public class C0804_06 {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList();    //특정객체마ㅣㄴ받게하는것<>
		list.add(new Stu("홍길동",100,100,100));
		list.add(new Stu("유관순",90,90,100));
		list.add(new Stu("이순신",80,100,100));
		list.add(new Stu("강감찬",70,100,100));
		list.add(new Stu("김구",60,100,100));
		
		for(int i=0;i<list.size();i++) {
//			Stu s = (Stu)list.get(i);
//			System.out.printf("%s %d\n",s.getName(),s.getKor());
			System.out.printf("%d %s %d\n",list.get(i).getStuNo(),list.get(i).getName(),list.get(i).getKor());
		}

	}

}
