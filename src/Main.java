import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanI = new Scanner(System.in);
		Scanner scanS = new Scanner(System.in);
		List list = new List();
		int a = 0;
		for (a = 0; a != 4;) {
			System.out.println("1.웨이팅 등록 2.웨이팅 삭제 3.웨이팅 현횡 4.종료");
			a = scanI.nextInt();
			switch (a) {
			case 1:
				System.out.println("이름 : ");
				String name = scanS.next();
				System.out.println("인원 : ");
				int number = scanI.nextInt();
				System.out.println("전화번호 : ");
				String phone = scanS.next();
				list.add(name, number, phone);
				break;
			case 2:
				System.out.println("삭제 번호 :");
				int waitingNumber = scanI.nextInt();
				list.check(waitingNumber);
				break;
			case 3:
				list.showWaiting();
				break;
			case 4:
				break;
			}
		}

	}

}
