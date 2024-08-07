class DBox<L,R>{
	private L str;
	private R num;

	public void set(L str,R num) {
		this.str = str;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return str + " & " + num + "개"; 
	}

}

public class GenericTime2 {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box); // Apple & 25개       
	}
}
