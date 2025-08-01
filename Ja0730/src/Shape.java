
public class Shape {
	String color = "blue";
	void draw(String sname,Point p) {
		System.out.println(sname+" 도형의 그림을 그립니다.");
		System.out.printf("[ 좌표 : %d,%d ]\n",p.x,p.y);
		//하단으로 그림을 그리는 로직이 들어가야 함.
	}
	
	//오버로딩 - 메소드명같고 매개변수 타입or개수가 다른것
	void draw(String sname,Point[] p) {
		System.out.println(sname+" 도형의 그림을 그립니다.");
		for(int i=0;i<p.length;i++) {
			System.out.printf("[ 좌표 : %d,%d ]\n",p[i].x,p[i].y);
		}
	}

}
