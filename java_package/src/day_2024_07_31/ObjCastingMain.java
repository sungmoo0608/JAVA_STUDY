package day_2024_07_31;


//public String toString() {
//return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}

class A{
	public void aaa() {
		System.out.println("aaa 호출");
	}
	
	@Override
	public String toString() {
	return "주소는 비밀";
	}
}

class B extends A {
	public void bbb() {
		System.out.println("bbb 호출");
	}
}

class C extends A {
	public void ccc() {
		System.out.println("ccc 호출");
	}
}

class AA{
	public void aa() {}
}

class BB extends AA{
	
	@Override
	public void aa() {}
	
	//@Override
	public void bb() {}
}

public class ObjCastingMain {

	public static void main(String[] args) {
		A a = new A();
		
		String str = "111";
		System.out.println(str);
		
		System.out.println(a);
		System.out.println(new A());//public void println(Object x = new A())
		System.out.println(new B());//public void println(Object x = new B())
		
		
//		A a = new B();	// 다형성
//		
//		if(a instanceof B) {
//			B b = (B) a;	// 자식 = 부모
//			b.bbb();
//		}
//		
//		a = new C();
//		if(a instanceof B) {
//			System.out.println("트루입니다.1");
//		}
//		
//		if(a instanceof A) {
//			System.out.println("트루입니다.2");
//		}
//		
//		if(a instanceof C) {
//			System.out.println("트루입니다.3");
//		}
		
		
	}

}
