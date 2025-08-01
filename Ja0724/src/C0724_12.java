
public class C0724_12 {

	public static void main(String[] args) {
		// 1-25까지 숫자를 자동입력해서 출력하시오
		int[] num = new int[25];
		int[][] arr = new int[5][5];
		int rnum = 0;
		int temp = 0;
		
		
		//1-25까지 입력
		for (int i=0;i<25;i++) {
			num[i] = i+1;
		}
		
		//랜덤섞기
		for(int i=0;i<500;i++) {
			rnum = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		
		
		// 5*5 순차번호 입력
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		
		
		//번호출력
		for (int i=0;i<25;i++) {
			System.out.printf("%d ",num[i]);
		}
		
		System.out.printf("\n\n");
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
			System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}

	}//main

}
