package ja0721;

import java.util.Scanner;

public class C0721_10 {

	public static void main(String[] args) {
		// 이름, 국어점수, 영어점수를 입력받아 이름, 국어, 영어, 합계점수를 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오.");
		String name = scan.nextLine();
		
		System.out.println("국어점수를 입력하시오.");
		int kor = scan.nextInt();
		
		System.out.println("영어점수를 입력하시오.");
		int eng = scan.nextInt();
		
		System.out.println("수학점수를 입력하시오.");
		int math = scan.nextInt();
		
		
		int total = kor+eng+math;
		double avg = total/3.0 ; // int 나누기 double이라 소수점 아래도 있는 결과가 나옴 
		
		System.out.print("이룸 : "+name+"\t");
		System.out.println("합계 : "+total);  // 자리수 결정이 안됨
		System.out.printf("합계 : %d \n",total);
		System.out.printf("평균 : %.2f \n",avg); // 엔터를 포함하지 않음. %d가 정수, %f가 실수, %.2f 소수점 둘째자리까지만 나옴
		System.out.printf("평균 : %e \n",avg); // 지수표현식 사용
		
		System.out.printf("이름:%s, 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.2f \n",name,kor,eng,math,total,avg);
		

		

	}

}
