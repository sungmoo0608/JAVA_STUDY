class Parent {
	String msg = "Parent클래스";
	public String getMsg() {
		return msg;
	}
}

class Child extends Parent{
	String msg ="child클래스";
	public String getMsg() {
		return msg;
	}
}

class OverridingEx {

	public static void main(String[] args) {
		Child cd = new Child();
		System.out.println("cd : " + cd.getMsg());
		
		Parent pt = new Parent();
		System.out.println("pt : " + pt.getMsg());
	}
	
}