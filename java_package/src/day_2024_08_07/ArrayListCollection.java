package day_2024_08_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class IntLinkedList{
	int num;
	IntLinkedList link;
	public IntLinkedList(int num) {
		this.num = num;
	}
}

public class ArrayListCollection {

	public static void main(String[] args) {
		IntLinkedList l1 = new IntLinkedList(1);
		IntLinkedList l2 = new IntLinkedList(2);
		IntLinkedList l3 = new IntLinkedList(3);
		
		l1.link = l2;
		l2.link = l3;	
		
//		List<String> list = new ArrayList<>();	// 컬렉션 인스턴스 생성
		List<String> list = new LinkedList<>();
		
		// 컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 저장된 문자열 인스턴스의 참조
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+'\t');
		}
		System.out.println();
		
		// 1.5버전 이후 부터 사용가능
		for(String str : list) {
			System.out.print(str+'\t');
		}
		System.out.println();
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(str+'\t');
		}
		System.out.println();
		
		list.remove(0);	// 첫 번째 인스턴스 삭제
		
		// 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i)+'\t');
		}
		System.out.println();

	}

}
