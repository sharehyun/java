
public class Product {
	static int count = 0;
	int serialNo;
	String pName;
	
	//초기화블럭의이점: 생성자마다 공통으로 사용되는 부분을 초기화블럭으로 분리
	//코드길이가줄어듦. 쓸일은거의없지만 이론은알아야함
	{this.serialNo = ++count;}
	
	//기본생성자
	Product(){}
	
	Product(String pName){
		this.pName = pName;
	}
}
