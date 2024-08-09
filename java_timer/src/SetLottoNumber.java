import java.util.HashSet;
import java.util.Set;

public class SetLottoNumber {

	public static void main(String[] args) {
		Set<Integer> lottoSet = new HashSet();
		final int LOTTO=6;
		
		while(lottoSet.size() < LOTTO ) {
			int num = (int)((Math.random()*45)+1);
			lottoSet.add(num);
		}
		
		System.out.println(lottoSet);

	}

}
