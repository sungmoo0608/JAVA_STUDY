
public class Boolean2 {

	public static void main(String[] args) {
		
		boolean bool= true&&true;
		System.out.println(bool);
		
		bool = false&&true;
		System.out.println(bool);
		
		bool = true&&false;
		System.out.println(bool);
		
		bool = true&&true&&false;
		System.out.println(bool);
		
		bool = (10<0) && (10>0);
		System.out.println(bool);
		
		bool = false || false ;
		System.out.println(bool);
		
		bool = false || true ;
		System.out.println(bool);
		
		bool = (10<0) || (10>0);
		System.out.println(bool);
		
		bool = !true;
		System.out.println(bool);
		
		bool = !false;
		System.out.println(bool);

	}

}
