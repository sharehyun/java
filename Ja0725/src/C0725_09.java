import java.util.Scanner;

public class C0725_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] num = new String[45];
		String[][] num2 = new String[9][5];
		String temp = "";
		int rnum = 0;
		
		// 순차배열 값 입력
		for(int i=0;i<45;i++) {
			num[i] = i+1+"";
		}
		
//		// 순차배열 출력
//		System.out.println("          [ 순차번호출력 ]");
//		System.out.println("----------------------------------");
//		for(int i=0;i<45;i++) {
//			if (i==0) { }
//			else if(i%5==0) System.out.println();
//			System.out.print(num[i]+"\t");
//		}
//		System.out.println();
//		System.out.println("----------------------------------");
		
		
		// 순차배열 랜덤정렬
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 랜덤배열 값 입력
		for(int i=0;i<num2.length;i++) {
			for(int j=0;j<num2[i].length;j++) {
				num2[i][j] = num[5*i+j];
			}
		}
		
//		System.out.println();
//		System.out.println();
		
		
		
		// 랜덤배열 출력
		while(true){
			System.out.println("          [ 랜덤번호출력 ]");
			System.out.println("----------------------------------");
			for(int i=0;i<num2.length;i++) {
				for(int j=0;j<num2[i].length;j++) {
					System.out.print(num2[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("----------------------------------");
			
			System.out.print("번호를 입력하세요.>> ");
			String choice = scan.next();
			
			System.out.println();
			loop: for(int i=0;i<num2.length;i++) {
				for(int j=0;j<num2[i].length;j++) {
					if(choice.equals(num2[i][j])) {
						num2[i][j]="X";
						break loop;
					}
				}
				
			}
		}
			
		
		
		
		// 1차원 배열에서 처리 
//		// 랜덤배열 값 입력 - 순차배열 복사 후 랜덤정렬
//		System.arraycopy(num,0,num2,0,45);
//		for(int i=0;i<300;i++) {
//			rnum = (int)(Math.random()*45);
//			temp = num2[0];
//			num2[0] = num2[rnum];
//			num2[rnum] = temp;
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//		
//		
//		// 랜덤배열 출력
//		System.out.println("          [ 랜덤번호출력 ]");
//		System.out.println("----------------------------------");
//		for(int i=0;i<45;i++) {
//			if (i==0) { }
//			else if(i%5==0) System.out.println();
//			System.out.print(num2[i]+"\t");
//		}
//		System.out.println();
//		System.out.println("----------------------------------");
//		
//		System.out.println();

	}

}
