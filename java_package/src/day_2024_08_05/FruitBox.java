package day_2024_08_05;

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

//class Box{
//	private Object ob;
//	
//	public void set(Object o) {
//		ob = o ;
//	}
//	public Object get() {
//		return ob;
//	}
//}

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o ;
	}
	public T get() {
		return ob;
	}
}


public class FruitBox {
	public static void main(String[] args) {
		
		Box<Apple> abox = new Box<Apple>();
		Box<Orange> obox = new Box<>();
		
		Box<String> sbox = new Box<>();
		Box<Integer> ibox = new Box<>();
		Box<Double> dbox = new Box<>();
		
		abox.set(new Apple());
		//abox.set("new Orange()"); //Apple외에는 다른 타입 못넣음
		
		Apple ap = abox.get(); // 형변환도 필요없음
		
		System.out.println(ap);
		
		obox.set(new Orange());
		Orange op = obox.get(); 
		System.out.println(op);
		
		sbox.set("글자로 말해요");
		String str = sbox.get();
		System.out.println(str);
		
		ibox.set(123);
		int num = ibox.get();	//형변환 필요없음
		System.out.println(num);
		
		dbox.set(1.0);
		double dnum = dbox.get();	//형변환 필요없음
		System.out.println(dnum);
		
//		Box aBox = new Box();
//		Box oBox = new Box();
//		
////		aBox.set(new Apple());
////		oBox.set(new Orange());
//		
//		aBox.set("Apple");
//		oBox.set("Orange");
//		
//		Apple ap = (Apple)aBox.get();
//		Orange og = (Orange)oBox.get();
//		
//		System.out.println(ap);
//		System.out.println(og);
	}

}
