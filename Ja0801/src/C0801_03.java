
public class C0801_03 {
	public static void main(String[] args) {
		
		//String클래스
		String a = "abcdefg";
		//찾고자하는 단어의 위치 출력, -1이 나오면 없다는 뜻
//		System.out.println(a.indexOf("f")); 
		
		String str = "abcabcaaabbbbbbbchijkcaacaaaaaa";
		
		
		int n = 0;
		while (true) {
			n = str.indexOf("c",n);
			if(n!=-1) {
				System.out.println(n);
				n+=1;
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}

		
		
		
		
		
		
		
		
//		String[] str = {"a","b","c","d"};
//		String[] str2 = new String[4];
//		//_list 붙여서 배열에 넣고 배열을 다시 출력하시오.
//		for(int i=0;i<str.length;i++) {
//			str2[i] = str[i].concat("_list");
//			System.out.println(str2[i]);
//		}
		
//		
//		String a = "makecake";
//		if(a.contains("c")) { //단어가 포함되어 있는지 확인하는메소드
//			System.out.println("있다");
//		}else {
//			System.out.println("없다");
//		}
		
		
//		String a = "5조123456789";
//		char b = a.charAt(1);  //문자열에서 1개 문자를 가져오는 메소드
//		System.out.println(b);
//		System.out.println(a.charAt(10));
//		System.out.println(a.charAt(a.length()-1));  //문자길이

//		String a = "1";
//		for(int i=0;i<100;i++) {
//			a = a + i;
//		}
		
//		System.out.println(a);
		
		
//		String str1 = "abc";
//		String str2 = "abc";
//		String str3 = new String("abc");
//		String str4 = new String("abc");
//		
//		System.out.println(str1==str2);
//		System.out.println(str3==str4);
		
		
		//getClass() - 자신이 속한 클래스 정보 반환
//		Student s = new Student();
//		System.out.println(s.getClass().getName());
//		
		
		
		
		//toString() 객체를 출력할때 원하는 형태로 출력하는 method
//		Student s1 = new Student(1,"홍길동");
//		System.out.println(s1);
//		
//		Student s2 = new Student(s1);
		
		
		
		
		//hashcode() - 문자를 숫자에 있는 일정코드로 변경, 데이터수정확인
		// 암호화할때
//		String str1 = "1111";
//		String str2 = "abcd";
		
//		String str1 = new String("국세청이 상장 과정에서 사기적 부정거래 혐의를 받고 있는 하이브에 대해 세무조사에 착수했다. 주식시장 교란 등 소액주주 이익을 침해한 27개 기업을 대상으로 고강도 세무조사를 실시하겠다고 밝힌 가운데 하이브가 조사 대상에 포함됐다. 7월 29일 서울지방국세청 조사4국은 서울 용산구 하이브 본사에 직원들을 보내 세무조사에 필요한 자료들을 확보하는 현장 예치조사를 진행했다. ");
//		String str2 = new String("국세청이 상장 과정에서 사기적 부정거래 혐의를 받고 있는 하이브에 대해 세무조사에 착수했다. 주식시장 교란 등 소액주주 이익을 침해한 27개 기업을 대상으로 고강도 세무조사를 실시하겠다고 밝힌 하이브가 조사 대상에 포함됐다. 7월 29일 서울지방국세청 조사4국은 서울 용산구 하이브 본사에 직원들을 보내 세무조사에 필요한 자료들을 확보하는 현장 예치조사를 진행했다. ");
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
//		String str1 = new String("abc");
//		String str2 = new String("ab1c");
//		String str3 = new String("aaaaabbbbbccccc");
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str3.hashCode());
		
		
		//equaol() 메소드
//		String str1 = new String("aaa");
//		String str2 = new String("aaa");
//		if(str1.equals(str2)) {
//			System.out.println("같다");
//		}
		
		
		
		
		
//		Student s1 = new Student(1,"홍길동");
//		Student s2 = new Student(1,"홍길동");
//		
//		if(s1.equals(s2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
//		if(s1==s2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
		
		
//		Person p1 = new Person();
//		p1.id = 199901011101111L;
//		p1.name = "홍길동";
//		p1.address = "서울";
//		Person p2 = new Person(199901011101111L,"홍길동","서울");
//		
//		if(p1.equals(p2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		
//		System.out.println("p1 : "+p1);
//		System.out.println("p2 : "+p2);
		
		
		
		
//		String str1 = new String("aaa");
//		String str2 = new String("aaa");
//		
//		if(str1==str2) { //객체변수, 참조변수는 등가비교 불가
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		
//		if(str1.equals(str2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//
//		
//		int a1 = 100;
//		int a2 = 100;
//		
//		if(a1==a2) {  // 기본타입 : boolean,byte,char,short,int,long,float,double
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
	}

	private static String concat(String[] str, String[] str2) {
		// TODO Auto-generated method stub
		return null;
	}


}
