
public class C0730_01 extends Point {
//	int x; //인스턴스변수-객체선언후,개별,참조변수명.변수명
//	int y;
	int z;

	public static void main(String[] args) {
		C0730_01 c = new C0730_01();
		
		System.out.println("x : "+c.x);
		System.out.println("x : "+c.z);
		c.x = 100;
		c.add();
		

	}

}
