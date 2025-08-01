
public class C0729_12 {
	
	public static void main(String[] args) {
		//배열선언
		Pro[] p = new Pro[10];
		
		//
		p[0] = new Pro();
		p[1] = new Pro();
		p[2] = new Pro();
		p[3] = new Pro();
		p[4] = new Pro();
		
		//객체선언 "스마트폰"
		p[5] = new Pro("스마트폰");
		p[6] = new Pro("스마트폰");
		p[7] = new Pro("스마트폰");
		p[8] = new Pro("스마트폰");
		p[9] = new Pro("스마트폰");
		
		System.out.printf("%d %d %d %d %d\n",
				p[0].serialNo,p[1].serialNo,p[2].serialNo,
				p[3].serialNo,p[4].serialNo);
		System.out.printf("%d %d %d %d %d\n",
				p[5].serialNo,p[6].serialNo,p[7].serialNo,
				p[8].serialNo,p[9].serialNo);
		
	}

}
