public class StringReserve {

	public static void main(String[] args){
		
		StringBuilder str1 = new StringBuilder("abcde");
		System.out.println(str1.toString());
		
		str1.reverse();
		System.out.println(str1.toString());
	}
}