
public class C0728_12 {

	public static void main(String[] args) {
		//객체선언
		Data d = new Data();
		d.x = 10;
		System.out.println("change메소드 호출전 d.x : "+d.x);
		
		C0728_12.change(d);
		System.out.println("change메소드 호출후 d.x : "+d.x);
		
		
	}
	
	
	static void change(Data d) {
		d.x=1000;
		System.out.println("d.x :"+d.x);
		
	}
}

class Data{
	int x; //인스턴스변수 - 객체선언후 사용, 객체 개별사용, 참조변수명.변수
}
