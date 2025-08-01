
public class C0729_05 {

	public static void main(String[] args) {
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 5;
		
		Car c2 = new Car();
		c2.color = "black";
		c2.gearType = "auto";
		c2.door = 5;
		
		Car c3 = new Car("pink","stick",4);
		Car c4 = new Car("silver","auto",5);
		
		//값이 복사된 다른 객체 생성
		Car c5 = new Car(c3);
		//c3 값이 복사된 c5 생성
	}
}

