import java.util.Arrays;

public class C0801_05 {

	public static void main(String[] args) {
		
		String[] strArr = {"a.txt","b.hwp","c.xls","d.txt","e.png","f.jpg"};
		//이미지파일은 몇개있는지 출력하시오
		int count = 0;
		for(int i=0;i<strArr.length;i++) {
			if (strArr[i].endsWith("png")||strArr[i].endsWith("jpg")) {
				count++;
			}
		}
		System.out.printf("이미지파일 : %d 개",count);
		
		
		
		//split - 분리자를 통해 배열로 리턴
//		String str = "홍길동,유관순,이순신,강감찬,김구";
//		String[] name = str.split(",");
//		System.out.println(Arrays.toString(name));
		
		//split,배열,변수,객체선언
//		String str2 = "1,홍길동,100,100,100,300,100.0";
//		String[] gd = str2.split(",");
//
//		
//		int no = Integer.parseInt(gd[0]);
//		String name = gd[1];
//		int kor = Integer.parseInt(gd[2]);
//		int eng = Integer.parseInt(gd[3]);
//		int math = Integer.parseInt(gd[4]);
//		int total = Integer.parseInt(gd[5]);
//		double avg = Double.parseDouble(gd[6]);
//		
//		Student s1 = new Student(no,name,kor,eng,math);
//		
//		//출력
//		System.out.println(Arrays.toString(gd));
//		System.out.println();
//		
//		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
//		
//		for (int i=0;i<title.length;i++) {
//			System.out.print(title[i]+"\t");
//		}
//		System.out.println();
//		System.out.println("---------------------------------------------------------");
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
//				s1.getStuNo(),s1.getName(),s1.getKor(),s1.getEng(),
//				s1.getMath(), s1.getTotal(), s1.getAvg());

		
		
		
//		String str = "          ab    c      ";
//		System.out.println(str);
//		
//		//trim - 빈공백제거, 내부공백제거불가
//		System.out.println(str.trim());
//		
//		//replace - 대체
//		System.out.println(str.replace("ab","x"));
//		
//		//replace - " "을 ""대체, 전체공백제거
//		System.out.println(str.replace(" ", ""));
		
		
		
		
//		String str = "abcabcaaabbbbbbbchijkcaacaaaaaa";
//		// c가 몇개있는지 출력하시오.
//		int n = 0;
//		int count = 0;
//		while (true) {
//			n = str.indexOf("c",n);
//			if(n!=-1) {
//				System.out.println(n);
//				n++;
//				count++;
//			}else {
//				System.out.println("c 갯수 : "+count);
//				System.out.println("프로그램종료");
//				break;
//			}//if~else
//		}//while

	}

}
