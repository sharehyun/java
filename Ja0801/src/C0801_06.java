import java.util.ArrayList;

public class C0801_06 {

	public static void main(String[] args) {

//		wrapper클래스 - 8가지 기본타입의 객체타입을 말함
		//자바는 객체지향언어
		//boolean,char,byte,short,int,long,float,double - 객체가 아님.
		ArrayList list = new ArrayList();  //객체타입만 가능
		int a = 10;  //기본타입
		list.add(a); //가능 -> 자동으로 객체형변환 int -> Integer형변환
		
		System.out.println(list.get(0));
		
		
		Student s = new Student(1,"홍길동");
		System.out.println(s.getName());
		list.add(s);
		System.out.println(((Student)list.get(1)).getName());
		
		
		//Math 클래스
//		int a = 100;
//		int b = 50;
//		int c = 30;
//		최대값을 출력하시오.
//		System.out.println(Math.max(a,Math.max(b,c)));
		
		
//		Math.random();
//		Math.round(),floor(),ceil()
//		abs-절대값,pow-제곱
//		Math.pow(10,3); == 10*10*10
		
		
		//StringBuffer클래스 - 객체랑 똑같아서 equals()를 오버라이딩해야함
//		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);
//		
//		sb.append("123");
//		System.out.println(sb);
//		
//		StringBuffer str = new StringBuffer("가");
//		
//		for(int i=0;i<100;i++) {
//			str.append(i);
//		}
//		System.out.println(str);
		
		
//		String a = "a";
//		for(int i=0;i<100;i++) {
//			a = a + i;
//		}
//		System.out.println(a);
		
		
		//toLowerCase(), toUpperCase()
		
//		String str = "16조12345";
		//subString - 부분으로 가져오기
		// 123 출력
//		System.out.println(str.substring(3,6));
//		System.out.println(str.substring(0,2));
//		System.out.println(str.substring(3));  //3부터 끝까지
//		System.out.println(str.substring(3,7));
//		
//		String[] strArr = {"abc123","a12","bc23456"};
//		//처음부터 제일 뒤에서 1칸 앞까지 출력하시오.
//		for(int i=0;i<strArr.length;i++) {
//			System.out.println(strArr[i].substring(0,strArr[i].length()-1));
//		}
		
		
		
		//조 출력
//		System.out.println(str.charAt(2));
		
		
		//startsWith()
//		String str = "abc.txt";
//		System.out.println(str.startsWith("ab"));
		

	}

}
