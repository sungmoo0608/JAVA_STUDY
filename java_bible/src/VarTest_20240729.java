public class VarTest_20240729 {

	public void argTest(String ...n ) {
		for(int i = 0; i< n.length ; i ++) {
			System.out.println("n["+i+"]:"+n[i]);	
		}
		System.out.println("=====================");
	}

	public static void main(String[] args) {
		VarTest_20240729 vt = new VarTest_20240729();
		vt.argTest("Varags","Test");
		
		vt.argTest("100","600","900","1000");

	}

}
