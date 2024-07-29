import java.util.Arrays;

public class CharAZ {

	public static void main(String[] args) {
		
		char[] alphabet = new char[26];
		
		int j = 65;
		
		for(int i=0; i<alphabet.length;i++) {
			alphabet[i] = (char)(j+i);
		}
		
		System.out.println(Arrays.toString(alphabet));
	}

}