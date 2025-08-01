
public class C0725_07 {

	public static void main(String[] args) {
		//1차원배열 int25 1-25까지 입력, random
		
		int[] arr = new int[25];
		int[][] arr2 = new int [5][5];
		int temp = 0;
		int rnum = 0;
		
		for (int i=0;i<25;i++) {
			arr[i]=i+1;
		}
		for (int i=0;i<300;i++) {
			rnum = (int)(Math.random()*25);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		System.out.print("랜덤출력 : ");
		for (int i=0;i<25;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = arr[(5*i)+j];
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		//1차원배열
		//2차원배열

//		int[][] score = new int[5][6];
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<6;j++) {
//				score[i][j] = (6*i)+j+1;
//			}
//		}
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<6;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}

}
