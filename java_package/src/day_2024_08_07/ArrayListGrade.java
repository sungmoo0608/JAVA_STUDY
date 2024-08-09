package day_2024_08_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Grade{
	int num;
	Grade link;
	public Grade(int num) {
		this.num = num;
	}
}

public class ArrayListGrade {

	public static void main(String[] args) {
		Grade l1 = new Grade(1);
		Grade l2 = new Grade(2);
		Grade l3 = new Grade(3);
		
		
		List<String> list = new ArrayList<>();	// 컬렉션 인스턴스 생성
		
		
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

	}

}
