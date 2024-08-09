package day_2024_08_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		System.out.println("인스턴스 수 : " + set.size());
		
		// 반복자를 이용한 전체 출력
		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next()+'\t');
		}
		System.out.println();
		
		// for-each문을 이용한 전체 출력
		for(String s : set) {
			System.out.print(s+'\t');
		}
		System.out.println();
	}
}
