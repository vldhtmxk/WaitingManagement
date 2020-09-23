

import java.text.SimpleDateFormat;
import java.util.Date;

public class Guests {
	String name;
	int number;
	String phone;
	String time;
	SimpleDateFormat date = new SimpleDateFormat("HH½Ã mmºÐ");
	
	public Guests() {
	}
	public Guests(String name, int number , String phone) {
		this.name = name;
		this.number = number;
		this.phone = phone;
		time = date.format(new Date());
	}
}

