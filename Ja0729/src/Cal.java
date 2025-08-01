
public class Cal {
	//+,-,*,/
	int result;
	double result2;
	
	
	//
	void calProcess(double number[],int a, int b) {
		number[0] = a+b;
		number[1] = a-b;
		number[2] = a*b;
		number[3] = (double)a/b;
	}
	
	
	void add(int a, int b) {
		System.out.print(a+b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	void mul(int a,int b) {
		System.out.println(a*b);
	}
	void div(int a,int b) {
		System.out.println((double)a/b);
	}
	
	
//	int add(int a, int b) {
//		result = a+b;
//		return result;
//	}
//	int sub(int a, int b) {
//		result = a-b;
//		return result;
//	}
//	int mul (int a, int b) {
//		result = a*b;
//		return result;
//	}
//	double div (int a, int b) {
//		result2 = (double)a/b;
//		return result2;
//	}
	
	
}
