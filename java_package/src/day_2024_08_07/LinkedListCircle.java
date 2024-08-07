package day_2024_08_07;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCircle {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		double r;
		double sum = 0;
		
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			r = itr.next();	
			double circle = r*r*Math.PI;
			System.out.println(circle + "\t");
			sum += circle;
		}
		
		System.out.println("3개 원의 합 :" + sum + "\t");
	}
	
}
