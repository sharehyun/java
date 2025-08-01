
public class Card {
	int number;
	String kind;
	
	String[] c_shape = {
			"","A","2","3","4","5","6","7","8","9","10","J","Q","K"	
		};
	
	Card(){}
	Card(int number,String kind){
		this.number = number;
		this.kind = kind;
	}
	
	@Override  // 그냥 호출시에 주소값이 아니라 실제 값을 리턴해주도록 설정
	public String toString() {
		return "[ "+c_shape[number]+","+kind+" ]";
	}
}
