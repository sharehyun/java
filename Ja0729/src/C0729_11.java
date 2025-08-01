
public class C0729_11 {
	
	public static void main(String[] args) {

		Stuscore s1 = new Stuscore();
		System.out.println(s1.no);
		Stuscore s2 = new Stuscore();
		System.out.println(s2.no);
		Stuscore s3 = new Stuscore("이순신",100,100,99);
		System.out.println(s3.no);
		Stuscore s4 = new Stuscore("강감찬",100,100,99);
		System.out.println(s4.no);

		
		Stuscore[] stu = new Stuscore[4];
		stu[0] = new Stuscore();
		System.out.println(stu[0].no);
		stu[1] = new Stuscore();
		System.out.println(stu[1].no);
		stu[2] = new Stuscore("이순신",100,100,99);
		System.out.println(stu[2].no);
		stu[3] = new Stuscore("강감찬",90,90,99);
		System.out.println(stu[3].no);
		
		
	}

}
