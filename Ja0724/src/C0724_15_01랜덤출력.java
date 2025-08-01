
public class C0724_15_01랜덤출력 {

	public static void main(String[] args) {
		int[] arr = new int[25];
		//1,2,3...25
		//0만 있는 배열에 1을 7개 넣고 숫자를 섞어 출력하시오.
		
		
		for(int i=0;i<7;i++) {
			arr[i] = 1;
		}
		
		int temp = 0;
		int rnum = 0;
		
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*25);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
