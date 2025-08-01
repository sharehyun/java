package ja0721;

import java.util.Scanner;

public class C0721_11 {

	public static void main(String[] args) {
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
		double avg = total/3.0 ;
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,total,avg);

	}

}
