package day_2024_08_06;

class Box2<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory{

	public static Box2 makeBox(Box2 o) {
		Box2 box = new Box2();
		box.set(o);
		return box;
	}

	public static <T> Box2<T> makeBox2(T o) {
		Box2<T> box = new Box2<T>();
		box.set(o);
		return box;
	}
	
	public static <T> T makeBox3(T o) {
		return o;
	}

}


public class GenericMethod {
	public static void main(String[] args) {
		Box2<String> sbox = BoxFactory.<String>makeBox2("sweet");
		System.out.println(sbox.get());

		Box2<Integer> ibox = BoxFactory.<Integer>makeBox2(1);
		System.out.println(ibox.get());

		Integer i = BoxFactory.<Integer>makeBox3(2);      
		System.out.println(i); //출력
		
		Double d = BoxFactory.<Double>makeBox3(3.0);      
		System.out.println(d); //출력
	}
}
