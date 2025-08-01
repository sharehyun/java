
public class RanNum {
	static int[] arr = new int[10]; // 클래스변수 - 객체선언X 공용 클래스명.변수명
	int a; // 인스턴스변수 - 객체선언O 개별 참조변수명.변수명
	
	//클래스 초기화블럭 - 객체선언 없이 바로 실행(생성자보다 먼저 실행됨)
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
	
}
