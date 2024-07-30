package day_2024_07_30;

class MobilePhone {
	protected String number;	//전화번호
	
	public MobilePhone (String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}


public class MobileSmartPhone {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-1234-4568","Nougat");
		phone.answer();
		phone.playApp();
		
		//다형성(polymorphizm)=폴리몰피즘(부모=자식)
		MobilePhone ph2 = new SmartPhone("010-4568-1234","Nougat");
		// SmartPhone ph3 = new MobilePhone("010-4568-1234","Nougat");
		
		// public System.out.println(object x = phone);
		System.out.println(phone);
		
		ph2.answer();
		// ph2.playApp();
	}

}
