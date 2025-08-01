
public class C0722_04 {

	public static void main(String[] args) {
		double p = 123.5468777;
		double s_p = (int)(p * 100000)/100000D;
		System.out.println(s_p);
		
		// round-반올림, floor-버림, ceil-올림
		// 소수점 5자리 남기고 절사
		double d = Math.floor(p*100000)/100000D;
		System.out.println(d);
		
		// 소수점 5자리에서 반올림해서 4자리까지 출력하시오
		double num = Math.round(p*10000)/10000D;
		System.out.println(num);
		
		// 소수점 3자리에서 올림해서 2자리까지 출력하시오
		double num2 = Math.ceil(p*100)/100D;
		System.out.println(num2);
		
		
		
		
//		double pi = 3.141592;  // 3.141만 남기고 싶음
//		double s_pi = (int)(pi * 1000) / 1000d;  //3141.592
//		System.out.println(pi);
//		System.out.println(s_pi);

	}

}
