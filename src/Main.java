import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanI = new Scanner(System.in);
		Scanner scanS = new Scanner(System.in);
		List list = new List();
		int a = 0;
		for (a = 0; a != 4;) {
			System.out.println("1.������ ��� 2.������ ���� 3.������ ��Ⱦ 4.����");
			a = scanI.nextInt();
			switch (a) {
			case 1:
				System.out.println("�̸� : ");
				String name = scanS.next();
				System.out.println("�ο� : ");
				int number = scanI.nextInt();
				System.out.println("��ȭ��ȣ : ");
				String phone = scanS.next();
				list.add(name, number, phone);
				break;
			case 2:
				System.out.println("���� ��ȣ :");
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
