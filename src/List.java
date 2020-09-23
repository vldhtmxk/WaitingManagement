public class List {
	Guests[] guest = new Guests[10];
	int waitingNumber=0;
	int checkedNumber=0;
	
	public List() {}
	
	public void add(String name, int number, String phone) {
		guest[waitingNumber] = new Guests(name,number,phone);
		waitingNumber++;
		if(guest[waitingNumber]!=null)
			System.out.println("�Է� ����");
		
		
	}
	public void check(int number) {
		if(guest[number-1]!=null) {
			guest[number-1]=null;
			System.out.println("���� ����");
		}
		else {
			System.out.println("���� �մ��Դϴ�");
			return;
		}
		checkedNumber++;
		if(waitingNumber==checkedNumber) {
			waitingNumber=0;
			checkedNumber=0;
			System.out.println("-------����Ʈ�� �ʱ�ȭ �մϴ�------");
		}
	}
	public void showWaiting() {
		if(waitingNumber==0) {
			System.out.println("������ �մ��� �����ϴ�");
			return;
		}
		System.out.println("��ȣ  �̸�  �ο�    ��ȣ          �ð� ");
		for(int i = 0;i<waitingNumber;i++) {
			if(guest[i]==null)
				continue;
			System.out.println(" "+(i+1)+"  "+guest[i].name+"  "+guest[i].number+"  "+guest[i].phone+"  "+guest[i].time);
		}
	}
}
