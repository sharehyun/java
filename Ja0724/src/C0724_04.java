import java.util.Scanner;

public class C0724_04 {
	public static void main(String[] args) {
		//1-45까지 숫자 6개를 입력받고 로또번호 6개를 생성해서 출력하시오.
		//입력번호 : 
		//로또번호 : 
		
		Scanner scan = new Scanner(System.in);
		int input[] = new int[6];
		int lotto[] = new int[6];
		int num[] = new int[45];
		
		int rnum = 0;
		int temp = 0;
		
		for (int i=0;i<45;i++) {
			num[i]=i+1;
		}
		
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 숫자를 입력하세요. (1-45)>> ",i+1);
			input[i] = scan.nextInt();
		}
		
		for (int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		for (int i=0;i<6;i++) {
			lotto[i] = num[i];
		}
		
		System.out.printf("입력번호 : ");
		for (int i=0;i<6;i++) {
			System.out.printf(input[i]+" ");	
		}
		
		
		System.out.println();
		System.out.printf("로또번호 : ");
		for (int i=0;i<6;i++) {
			System.out.printf(lotto[i]+" ");
		}
		
		
		
		
		
	}
	
}
