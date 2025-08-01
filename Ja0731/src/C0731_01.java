import java.util.Scanner;

public class C0731_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer("aaa","홍길동",10000000,0);
		
		
		System.out.printf("%s 님 로그인 성공!\n",b1.name);
		System.out.printf("현재잔액 : %,d\n",b1.money);
		
		System.out.println("---------------------------");
		
		while(true) {
			
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. TV - 1,000,000");
			System.out.println("2. AUDIO - 500,000");
			System.out.println("3. COMPUTER - 1,500,000");
			System.out.println("4. 구매내역");
			System.out.println("5. 현재보유금액 확인");
			System.out.println("---------------------------");
			System.out.print("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("TV를 구매했습니다.");
				b1.buy(new Tv());
				System.out.printf("현재잔액 : %,d\n",b1.money);
				break;
			case 2:
				System.out.println("AUDIO를 구매했습니다.");
				b1.buy(new Audio());
				System.out.printf("현재잔액 : %,d\n",b1.money);
				break;
			case 3:
				System.out.println("COMPUTER를 구매했습니다.");
				b1.buy(new Computer());
				System.out.printf("현재잔액 : %,d\n",b1.money);
				break;
			case 4:
				System.out.println("[ 구매내역 ]");
				for(int i=0;i<b1.list.size();i++) {
					System.out.printf("%d. %s, %,d \n",i+1,((Product)b1.list.get(i)).name,((Product)b1.list.get(i)).price);
				}//for
				break;
			case 5:
				System.out.println("[ 현재보유금액 ]");
				System.out.printf("%,d 원\n",b1.money);
				break;
			}//switch
			System.out.println();
		}//while
	}//main
}//class
