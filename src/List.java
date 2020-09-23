public class List {
	Guests[] guest = new Guests[10];
	int waitingNumber=0;
	int checkedNumber=0;
	
	public List() {}
	
	public void add(String name, int number, String phone) {
		guest[waitingNumber] = new Guests(name,number,phone);
		waitingNumber++;
		if(guest[waitingNumber]!=null)
			System.out.println("입력 성공");
		
		
	}
	public void check(int number) {
		if(guest[number-1]!=null) {
			guest[number-1]=null;
			System.out.println("삭제 성공");
		}
		else {
			System.out.println("없는 손님입니다");
			return;
		}
		checkedNumber++;
		if(waitingNumber==checkedNumber) {
			waitingNumber=0;
			checkedNumber=0;
			System.out.println("-------리스트를 초기화 합니다------");
		}
	}
	public void showWaiting() {
		if(waitingNumber==0) {
			System.out.println("웨이팅 손님이 없습니다");
			return;
		}
		System.out.println("번호  이름  인원    번호          시간 ");
		for(int i = 0;i<waitingNumber;i++) {
			if(guest[i]==null)
				continue;
			System.out.println(" "+(i+1)+"  "+guest[i].name+"  "+guest[i].number+"  "+guest[i].phone+"  "+guest[i].time);
		}
	}
}
