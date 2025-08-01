import java.util.Scanner;

public class C0722_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int input = scan.nextInt();
		//봄여름가을겨울
		String season;
		String season2;
		
		if (input>=3&&input<=5) {
			season = "봄";
		}else if(input>=6&&input<=8){
			season = "여름";
		}else if(input>=9&&input<=11) {
			season = "가을";
		}else if(input==12||input==1||input==2) {
			season = "겨울";
		}else {
			season = "알수없음";
		}
		
		switch(input) {
		case 12: case 1: case 2:  // case 12,1,2 -> season2 = "겨울";   //이것도 되는데 잘안씀 
			season2 = "겨울";
			break;
			
		case 3: case 4: case 5:
			season2 = "봄";
			break;
			
		case 6: case 7: case 8:
			season2 = "여름";
			break;
			
		case 9: case 10: case 11:
			season2 = "가을";
			break;
			
		default:
			season2 = "알수없음";
			break;
		}
		
		System.out.println("if 판별 : "+season);
		System.out.println("switch 판별 : "+season2);
	}
	
}
