import java.util.Arrays;
import java.util.Scanner;

public class C0728_13 {

	public static void main(String[] args) {
		//소수점을 입력한 후 다음 입력된 자리수에서 반올림된 값 출력 구현
		// 1.256 -> 2, 1.3
		Scanner scan = new Scanner(System.in);
		double[] number = new double[3];
		System.out.println("소수점을 입력하세요.>> ");
		double input = scan.nextDouble();
		System.out.println("자리수를 입력하세요.>> ");
		int n = scan.nextInt();
		
		Cal c = new Cal();
		c.powProcess(input,n,number);
		
		System.out.println("결과 : "+Arrays.toString(number));
	}
}