import java.util.Arrays;

public class ArrayString {

	public static void main(String[] args) {
		
        String[] sr = new String[4];

        sr[0] = new String("Java");
        sr[1] = new String("System");
        sr[2] = new String("Compiler");
        sr[3] = new String("Park");

		int cnum=0;
		
		for(int i=0;i<sr.length;i++) {
			cnum += sr[i].length();
		}
		
		System.out.println("총 글자수 :"+cnum);
		
	}

}
