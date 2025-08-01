
public class C0725_02 {

	public static void main(String[] args) {
		//객체선언
		// 홍길동 100 100 99 299 99.67;
		
		Stuscore s1 = new Stuscore();
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 99;
		s1.total = s1.kor + s1.eng + s1.math;
		s1.avg = s1.total/3.0;
		
		System.out.printf("%s %d %d %d %d %.2f\n",s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg);
		System.out.println(s1);
		
	}

}
