import java.util.Arrays;
import java.util.Scanner;

public class C0728_11 {

	public static void main(String[] args) {
		// 숫자맞추기 프로그램
		Scanner scan = new Scanner(System.in);
		Process p = new Process();
		
		System.out.println("[ 프로그램 ]");
		System.out.println("1. 숫자맞추기");
		System.out.println("2. 로또맞추기");
		System.out.println("3. 구구단");
		System.out.println("4. 결과리턴");
		System.out.println("--------------------");
		System.out.printf("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			p.numProcess();
			break;
		case 2:
			int[] myNo = new int[6];
			int[] num = new int[45];
			int[] lotto = new int[6];
			int[] okNo = new int[6];
			int count = 0; //맞춘개수

			
			//proces.java에 메소드 구현
			count = p.lottoProcess(num,lotto,myNo,okNo,count);
			
			
			System.out.println("입력번호 : "+Arrays.toString(myNo));
			System.out.println("입력번호 : "+Arrays.toString(lotto));
			System.out.printf("맞춘번호 : ");
			for(int i=0;i<count;i++) {
				System.out.printf(okNo[i]+" ");
			}
			System.out.println();
			
			break;
		case 3:
			p.gugudan();
			break;
		case 4:
			// 두수를입력받아 합차곱몫 값 출력
			double[] result = {0,0,0,0};
			int a = 10;
			int b = 5;
			
			p.resultProcess(a,b,result);  // result-참조형 매개변수, 주소값을 보내 method에서 배열 내부값을 수정함
			System.out.println(Arrays.toString(result));
			
			break;
		}
		
	}

}
