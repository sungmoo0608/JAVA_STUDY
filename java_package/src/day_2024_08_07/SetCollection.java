package day_2024_08_07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add(new String("AAA"));
		set.add("AAA");
		
		System.out.println(set);
		System.out.println("사이즈 : "+set.size());
	}
}
