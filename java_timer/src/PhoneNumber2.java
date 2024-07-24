class Phone{
	String name,phone;
	
	Phone(String name,String phone){
		this.name = name;
		this.phone = phone;
	}
	
	void show(){
		System.out.println("이름 : " + name);
		System.out.println("전화 번호 : " + phone);
	}

	Phone(){
		this.name = "없음";
		this.phone = "없음";
	}
}


public class PhoneNumber2 {

	public static void main(String[] args) {
		Phone phone = new Phone("홍길동", "010-0000-0000");        
				phone.show();

		phone = new Phone("홍길순", "010-1111-1111");        
				phone.show();

		phone = new Phone();
				phone.show();

	}

}
