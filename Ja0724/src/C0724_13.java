import java.util.Scanner;

public class C0724_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[25];
		String[][] arr = new String[5][5];
		int temp = 0;
		
		//1-25까지 숫자 입력, 랜덤으로 번호섞어서 arr배열에 입력해서 출력하시오.
		//num배열 - int / arr배열 - String
		
		//num배열 숫자입력
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		//num배열 랜덤
		for(int i=0;i<500;i++) {
			int rnum = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 5*5 순차번호 입력
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = num[5*i+j]+"";
			}
		}
		
		

		
		//번호출력
		while(true) {
			System.out.println();
			System.out.println("             [ 2차원 배열 ]");
			System.out.println("------------------------------------");
			for (int i=0;i<5;i++) {
				for (int j=0;j<5;j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("------------------------------------");
			System.out.printf("원하는 번호를 입력하세요.>> ");
			String input = scan.next();
			
			loop:for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[i].length;j++) {
					if(arr[i][j].equals(input)) {
						arr[i][j] = "X";
						break loop;
					}
				}
			}
		}
		
		
		
		
		

	}

}
