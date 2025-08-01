
public class C0728_03 {

	public static void main(String[] args) {
		StuScore s = new StuScore();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 99;
		s.total = s.kor+s.eng+s.math;
		
		StuScore s2 = new StuScore();
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 91;
		s2.total = s2.kor+s2.eng+s2.math;
		
		System.out.printf("%s %d %d %d %d\n",s.name,s.kor,s.eng,s.math,s.total);
		System.out.printf("%s %d %d %d %d\n",s2.name,s2.kor,s2.eng,s2.math,s2.total);
		
		s2 = s;
		System.out.printf("%s %d %d %d %d\n",s2.name,s2.kor,s2.eng,s2.math,s2.total);

	}

}
