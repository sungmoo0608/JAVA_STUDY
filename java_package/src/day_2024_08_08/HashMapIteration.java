package day_2024_08_08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		System.out.println("1 containsKey 45 : " + map.containsKey(45));
		System.out.println("2 containsKey 60 : " + map.containsKey(60));
		System.out.println("3 containsValue : " + map.containsValue("야옹야옹"));
		System.out.println("4 isEmpty : " + map.isEmpty());
		System.out.println("5 size : " + map.size());
		System.out.println("6 map : " + map);
		System.out.println("7 replace : " + map.replace(23, "개냥이"));
		
		// key만 담고 있는 컬렉션 인스턴스 생성
		Set<Integer> ks = map.keySet();
		
		// 전체 key 출력 (for-each문 기반)
		for(Integer n : ks) {
			System.out.print(n.toString()+'\t');
		}
		System.out.println();
		
		// 전체 value 출력 (for-each문 기반)
		for(Integer n : ks) {
			System.out.print(map.get(n).toString()+'\t');
		}
		System.out.println();
		
		// 전체 value 출력 (반복자 기반)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			System.out.print(map.get(itr.next())+'\t');
		}
		System.out.println();
	}

}
