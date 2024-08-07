package day_2024_08_05;

class Box1<T>{
	private T ob;
	
	public void set(T o) {
		ob = o ;
	}
	
	public T get() {
		return ob;
	}
}


public class BoxInBox {
	public static void main(String[] args) {
		Box1<String> sBox = new Box1<>();
		sBox.set("I am so Happy.");
		
		Box1<Box1<String>> wBox = new Box1<>();
		wBox.set(sBox);
		
		Box1<Box1<Box1<String>>> zBox = new Box1<>();
		zBox.set(wBox);
		
		System.out.println(zBox.get().get().get());
	}

}
