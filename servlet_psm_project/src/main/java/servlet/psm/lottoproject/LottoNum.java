package servlet.psm.lottoproject;

import java.util.HashSet;
import java.util.Set;

public class LottoNum {

	public static void main(String[] args) {
		Set<Integer> lottoSet = new HashSet();
		final int LOTTO=6;
		
		while(lottoSet.size() < LOTTO ) {
			int num = (int)((Math.random()*45)+1);
			lottoSet.add(num);
		}
	}
}
