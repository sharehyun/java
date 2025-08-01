import java.util.Arrays;
import java.util.Scanner;

public class C0725_06 {

	public static void main(String[] args) {
		//배열
		Scanner scanner = new Scanner(System.in);
		// 배열 선언
		int[] arr = new int[45];  //랜덤45
		int[] lotto = new int[6]; //로또번호6
		int[] myNo = new int[6];  //입력번호6
		int[] okNo = new int[6];  //정답번호
		int count = 0; //정답개수
		
		for(int i=0;i<6;i++) {
			System.out.println("입력된 번호 : "+Arrays.toString(myNo));
			System.out.println("1-45까지 번호를 입력하세요>> ");
			
			myNo[i] = scanner.nextInt();
		}
		
		
		//배열 번호입력
		for (int i=0;i<45;i++) {
			arr[i]=i+1;
		}
		
		//랜덤섞기
		int temp = 0;
		int rnum = 0;
		for (int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		// 배열복사 메소드사용
		System.arraycopy(arr,0,lotto,0,6);
		
		// 배열 로또번호출력
		System.out.print("로또번호 : ");
		for (int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
		
		
		
		
		
//		int rnum = (int)(Math.random()*45);
//		int a = (int)(Math.random()*10)+1;
//		System.out.println(a);
		
		
//		int[] arr = new int[45];
//		for (int i=0;i<45;i++) {
//			arr[i] = i+1;
//		}
//		for (int i=0;i<45;i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		int[] arr = new int[5];

	}

}
