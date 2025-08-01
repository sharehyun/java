import java.util.Scanner;

public class C0724_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//이름 5개를 입력받아 출력하시오.
		
		// 배열선언
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		
		// 입력부분
		for(int i=0;i<5;i++) {
			System.out.printf("%d번째 이름을 입력하시오.>> ",i+1);
			name[i] = scan.next();
			System.out.printf("%s 학생의 국어점수를 입력하시오.>> ",name[i]);
			kor[i] = scan.nextInt();
			System.out.printf("%s 학생의 영어점수를 입력하시오.>> ",name[i]);
			eng[i] = scan.nextInt();
			System.out.printf("%s 학생의 수학점수를 입력하시오.>> ",name[i]);
			math[i] = scan.nextInt();
			System.out.println();
		}
		
		// 출력부분
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-----------------------------------------------");
		for (int i=0; i<5;i++) {
			int total = kor[i]+eng[i]+math[i];
			double avg = total/3.0;
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total,avg);
		}
		
		
		
		
		
		
		
//		//배열선언1
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		for(int i=0;i<5;i++) {
//			arr[i] = i+1;
//		}
//		//배열선언2
//		int[] arr2 = {1,2,3,4,5};
//		//배열선언3
//		int[] arr3 = new int[] {1,2,3,4,5};
//		
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
