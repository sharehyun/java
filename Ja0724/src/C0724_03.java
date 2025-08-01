import java.util.Arrays;

public class C0724_03 {

	public static void main(String[] args) {
		// 로또번호 맞추기
//		int lotto = (int)(Math.random()*3)+1;
		
		//1-45까지 숫자가 들어있는 배열 생성
		int[] num = new int[45];
		// 번호입력
		for (int i=0;i<45;i++) {
			num[i]=i+1;
		}
		
		// 번호섞기
		int rnum = 0;
		int temp = 0; //임시저장
		for (int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		
		// 번호출력
		for (int i=0;i<45;i++) {
			System.out.print(num[i]+" ");
		}
		

	}

}
