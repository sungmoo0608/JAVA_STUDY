class Box1<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}

}

public class GenericTime {
	public static void main(String[] args) {
        Box1<Integer> ibox = new Box1<>();
        Box1<Double> dbox = new Box1<>();
        
        dbox.set(1.0);
        double dNum = dbox.get();//형변환도 필요없음                
        System.out.println(dNum);
	}

}
