
public class C0725_03 {

	public static void main(String[] args) {
		//s1,s2
		Stuscore s1 = new Stuscore();
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 99;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		
		Stuscore s2 = new Stuscore();
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 91;
		s2.total = s2.kor+s2.eng+s2.math;
		s2.avg = s2.total/3.0;
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg);
		
		
	}

}
