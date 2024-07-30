public class MyClass2_20240729 {
	
	private String name;
	
	private int age;
	
	public MyClass2_20240729(){
		name = "www.oracle.com";
	}
	
	public MyClass2_20240729(String n){
		name = n;
	}
	
	public MyClass2_20240729(int a, String n) {
		age = a;
		name = n;
	}
	
	public MyClass2_20240729(String n,int a) {
		age = a;
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
		MyClass2_20240729 mc1 = new MyClass2_20240729();
		MyClass2_20240729 mc2 = new MyClass2_20240729("아라치");
		MyClass2_20240729 mc3 = new MyClass2_20240729("마루치",46);
		MyClass2_20240729 mc4 = new MyClass2_20240729(23,"오자바");
		
		System.out.println(mc1.getName()+","+mc1.getAge());
		System.out.println(mc2.getName()+","+mc2.getAge());
		System.out.println(mc3.getName()+","+mc3.getAge());
		System.out.println(mc4.getName()+","+mc4.getAge());
		
	}

}
