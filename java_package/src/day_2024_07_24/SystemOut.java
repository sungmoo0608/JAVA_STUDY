package day_2024_07_24;

class AAA{
	public AAA() {
		System.out.println("AA"+"생성");
	}
	
	public void println() {
		System.out.println("슥샥쇽!");
	}
}

class System3{
	static AAA out = new AAA();
}

//javac ClassVar.java;
//java.exe ClassVar


class SystemOut {

	public static void main(String[] args) {

		System3.out.println();    
		System3.out.println();    
		System3.out.println(); 
    	
	}

}
