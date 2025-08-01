import java.util.Arrays;
import java.util.Scanner;

public class Process {
	Scanner scan = new Scanner(System.in);
	//java method 단점 : return 1개만 가능함
	int lottoProcess(int[] num, int[] lotto,int[] myNo,int[] okNo,int count) {
		//1-45 숫자 입력
		for(int i=0;i<45;i++) {
			num[i]=i+1;
		}
		
		//숫자배열 섞기
		int rnum = 0;
		int temp = 0;		
		for (int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 로또배열에 6개 넣기
		System.arraycopy(num, 0, lotto, 0, 6);
		
		// 숫자 입력, 검증
		System.out.println("1-45까지 숫자 중 6개 입력");
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 숫자>> ",i+1);
			myNo[i] = scan.nextInt();
			
			loop:for(int j=0;j<6;j++) {
				if (myNo[i]==lotto[j]) {
					okNo[count]=lotto[j];
					count++;
					break loop;
				}
			}//loop
		}//숫자입력
		
		System.out.println();
		
		//okNo 출력용 count return
		return count;
					
		
		
	}
	
	
	
	
	void resultProcess(int a, int b,double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	
	
	
	
	void gugudan() {
		//구구단
		System.out.println("2단부터 입력한 단까지 출력합니다.>> ");
		int number = scan.nextInt();
		System.out.println("   [ 구구단 ]");
		System.out.println("---------------");
		if(number<2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		for(int i=2;i<=number;i++) {
			System.out.printf(" [ %d 단 ]",i);
			for(int j=1;j<=9;j++) {
			System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
		
	}
	
	
	void numProcess() {
		//숫자맞추기 프로그램을 구현
		System.out.println("[ 숫자맞추기 프로그램 ]");
		System.out.println("1-100까지 숫자를 입력하세요.");
		int rnum = (int)(Math.random()*100)+1;
		int[] input = new int[10];
		int i=0;
		loop:while(i<10) {
			System.out.printf("%d번째 도전!>> ",i+1);
			input[i]= scan.nextInt();
			
			if(input[i]>rnum) System.out.println("입력값이 큽니다. 더 작은 수를 입력하세요.");
			else if(input[i]<rnum) System.out.println("입력값이 작습니다. 더 큰 수를 입력하세요.");
			else {
				System.out.println("정답입니다.");
				break loop;
			}
			System.out.println();
			i++;
		}//while
		System.out.println("정답 : "+rnum);
		System.out.println("입력값 : "+Arrays.toString(input));
	}
}
